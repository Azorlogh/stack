package stack

import (
	"fmt"
	"time"

	"github.com/formancehq/fctl/membershipclient"
	fctl "github.com/formancehq/fctl/pkg"
	"github.com/pkg/errors"
	"github.com/pterm/pterm"
	"github.com/spf13/cobra"
)

func NewListCommand() *cobra.Command {
	const (
		deletedFlag = "deleted"
	)
	return fctl.NewMembershipCommand("list",
		fctl.WithAliases("ls", "l"),
		fctl.WithShortDescription("List stacks"),
		fctl.WithArgs(cobra.ExactArgs(0)),
		fctl.WithBoolFlag(deletedFlag, false, "Display deleted stacks"),
		fctl.WithRunE(func(cmd *cobra.Command, args []string) error {
			cfg, err := fctl.GetConfig(cmd)
			if err != nil {
				return err
			}

			profile := fctl.GetCurrentProfile(cmd, cfg)

			organization, err := fctl.ResolveOrganizationID(cmd, cfg)
			if err != nil {
				return errors.Wrap(err, "searching default organization")
			}

			apiClient, err := fctl.NewMembershipClient(cmd, cfg)
			if err != nil {
				return err
			}

			rsp, _, err := apiClient.DefaultApi.ListStacks(cmd.Context(), organization).
				Deleted(fctl.GetBool(cmd, deletedFlag)).
				Execute()
			if err != nil {
				return errors.Wrap(err, "listing stacks")
			}

			if len(rsp.Data) == 0 {
				fmt.Fprintln(cmd.OutOrStdout(), "No stacks found.")
				return nil
			}

			tableData := fctl.Map(rsp.Data, func(stack membershipclient.Stack) []string {
				data := []string{
					stack.Id,
					stack.Name,
					profile.ServicesBaseUrl(&stack).String(),
					stack.RegionID,
				}
				if fctl.GetBool(cmd, deletedFlag) {
					if stack.DeletedAt != nil {
						data = append(data, stack.DeletedAt.Format(time.RFC3339))
					} else {
						data = append(data, "")
					}
				}
				return data
			})
			headers := []string{"ID", "Name", "Dashboard", "Region"}
			if fctl.GetBool(cmd, deletedFlag) {
				headers = append(headers, "Deleted at")
			}
			tableData = fctl.Prepend(tableData, headers)
			return pterm.DefaultTable.
				WithHasHeader().
				WithWriter(cmd.OutOrStdout()).
				WithData(tableData).
				Render()
		}),
	)
}
