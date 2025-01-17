// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"github.com/formancehq/formance-sdk-go/pkg/models/shared"
	"net/http"
)

type ChangeConfigSecretRequest struct {
	ConfigChangeSecret *shared.ConfigChangeSecret `request:"mediaType=application/json"`
	// Config ID
	ID string `pathParam:"style=simple,explode=false,name=id"`
}

type ChangeConfigSecretResponse struct {
	// Secret successfully changed.
	ConfigResponse *shared.ConfigResponse
	ContentType    string
	// Error
	ErrorResponse *shared.ErrorResponse
	StatusCode    int
	RawResponse   *http.Response
}
