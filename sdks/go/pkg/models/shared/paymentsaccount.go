// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"encoding/json"
	"fmt"
	"time"
)

type PaymentsAccountType string

const (
	PaymentsAccountTypeTarget PaymentsAccountType = "TARGET"
	PaymentsAccountTypeSource PaymentsAccountType = "SOURCE"
)

func (e PaymentsAccountType) ToPointer() *PaymentsAccountType {
	return &e
}

func (e *PaymentsAccountType) UnmarshalJSON(data []byte) error {
	var v string
	if err := json.Unmarshal(data, &v); err != nil {
		return err
	}
	switch v {
	case "TARGET":
		fallthrough
	case "SOURCE":
		*e = PaymentsAccountType(v)
		return nil
	default:
		return fmt.Errorf("invalid value for PaymentsAccountType: %v", v)
	}
}

type PaymentsAccount struct {
	CreatedAt time.Time           `json:"createdAt"`
	ID        string              `json:"id"`
	Provider  Connector           `json:"provider"`
	Reference string              `json:"reference"`
	Type      PaymentsAccountType `json:"type"`
}
