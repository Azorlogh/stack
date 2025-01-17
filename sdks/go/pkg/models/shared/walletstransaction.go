// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"time"
)

type WalletsTransaction struct {
	Ledger *string `json:"ledger,omitempty"`
	// Metadata associated with the wallet.
	Metadata          map[string]string                   `json:"metadata"`
	PostCommitVolumes map[string]map[string]WalletsVolume `json:"postCommitVolumes,omitempty"`
	Postings          []Posting                           `json:"postings"`
	PreCommitVolumes  map[string]map[string]WalletsVolume `json:"preCommitVolumes,omitempty"`
	Reference         *string                             `json:"reference,omitempty"`
	Timestamp         time.Time                           `json:"timestamp"`
	Txid              int64                               `json:"txid"`
}
