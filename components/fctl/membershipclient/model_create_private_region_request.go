/*
Membership API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 0.1.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package membershipclient

import (
	"encoding/json"
)

// checks if the CreatePrivateRegionRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CreatePrivateRegionRequest{}

// CreatePrivateRegionRequest struct for CreatePrivateRegionRequest
type CreatePrivateRegionRequest struct {
	Name string `json:"name"`
}

// NewCreatePrivateRegionRequest instantiates a new CreatePrivateRegionRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreatePrivateRegionRequest(name string) *CreatePrivateRegionRequest {
	this := CreatePrivateRegionRequest{}
	this.Name = name
	return &this
}

// NewCreatePrivateRegionRequestWithDefaults instantiates a new CreatePrivateRegionRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreatePrivateRegionRequestWithDefaults() *CreatePrivateRegionRequest {
	this := CreatePrivateRegionRequest{}
	return &this
}

// GetName returns the Name field value
func (o *CreatePrivateRegionRequest) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *CreatePrivateRegionRequest) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *CreatePrivateRegionRequest) SetName(v string) {
	o.Name = v
}

func (o CreatePrivateRegionRequest) MarshalJSON() ([]byte, error) {
	toSerialize, err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreatePrivateRegionRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["name"] = o.Name
	return toSerialize, nil
}

type NullableCreatePrivateRegionRequest struct {
	value *CreatePrivateRegionRequest
	isSet bool
}

func (v NullableCreatePrivateRegionRequest) Get() *CreatePrivateRegionRequest {
	return v.value
}

func (v *NullableCreatePrivateRegionRequest) Set(val *CreatePrivateRegionRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCreatePrivateRegionRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCreatePrivateRegionRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreatePrivateRegionRequest(val *CreatePrivateRegionRequest) *NullableCreatePrivateRegionRequest {
	return &NullableCreatePrivateRegionRequest{value: val, isSet: true}
}

func (v NullableCreatePrivateRegionRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreatePrivateRegionRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}
