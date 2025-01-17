// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"encoding/json"
	"fmt"
	"github.com/formancehq/formance-sdk-go/pkg/models/shared"
	"net/http"
)

// ListAccountsBalanceOperator - Operator used for the filtering of balances can be greater than/equal, less than/equal, greater than, less than, equal or not.
type ListAccountsBalanceOperator string

const (
	ListAccountsBalanceOperatorGte ListAccountsBalanceOperator = "gte"
	ListAccountsBalanceOperatorLte ListAccountsBalanceOperator = "lte"
	ListAccountsBalanceOperatorGt  ListAccountsBalanceOperator = "gt"
	ListAccountsBalanceOperatorLt  ListAccountsBalanceOperator = "lt"
	ListAccountsBalanceOperatorE   ListAccountsBalanceOperator = "e"
	ListAccountsBalanceOperatorNe  ListAccountsBalanceOperator = "ne"
)

func (e ListAccountsBalanceOperator) ToPointer() *ListAccountsBalanceOperator {
	return &e
}

func (e *ListAccountsBalanceOperator) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "gte":
		fallthrough
	case "lte":
		fallthrough
	case "gt":
		fallthrough
	case "lt":
		fallthrough
	case "e":
		fallthrough
	case "ne":
		*e = ListAccountsBalanceOperator(v)
		return nil
	default:
		return fmt.Errorf("invalid value for ListAccountsBalanceOperator: %v", v)
	}
}

type ListAccountsRequest struct {
	// Filter accounts by address pattern (regular expression placed between ^ and $).
	Address *string `queryParam:"style=form,explode=true,name=address"`
	// Filter accounts by their balance (default operator is gte)
	Balance *int64 `queryParam:"style=form,explode=true,name=balance"`
	// Operator used for the filtering of balances can be greater than/equal, less than/equal, greater than, less than, equal or not.
	//
	BalanceOperator *ListAccountsBalanceOperator `queryParam:"style=form,explode=true,name=balanceOperator"`
	// Parameter used in pagination requests. Maximum page size is set to 15.
	// Set to the value of next for the next page of results.
	// Set to the value of previous for the previous page of results.
	// No other parameters can be set when this parameter is set.
	//
	Cursor *string `queryParam:"style=form,explode=true,name=cursor"`
	// Name of the ledger.
	Ledger string `pathParam:"style=simple,explode=false,name=ledger"`
	// Filter accounts by metadata key value pairs. Nested objects can be used as seen in the example below.
	Metadata map[string]string `queryParam:"style=deepObject,explode=true,name=metadata"`
	// The maximum number of results to return per page.
	//
	PageSize *int64 `queryParam:"style=form,explode=true,name=pageSize"`
}

type ListAccountsResponse struct {
	// OK
	AccountsCursorResponse *shared.AccountsCursorResponse
	ContentType            string
	// Error
	ErrorResponse *shared.ErrorResponse
	StatusCode    int
	RawResponse   *http.Response
}
