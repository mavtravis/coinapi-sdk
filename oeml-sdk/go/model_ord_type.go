/*
 * OEML - REST API
 *
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       
 *
 * API version: v1
 * Contact: support@coinapi.io
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"fmt"
)

// OrdType Order types are documented in the separate section: <a href=\"#oeml-order-params-type\">OEML / Starter Guide / Order parameters / Order type</a> 
type OrdType string

// List of OrdType
const (
	LIMIT OrdType = "LIMIT"
)

func (v *OrdType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := OrdType(value)
	for _, existing := range []OrdType{ "LIMIT",   } {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid OrdType", value)
}

// Ptr returns reference to OrdType value
func (v OrdType) Ptr() *OrdType {
	return &v
}

type NullableOrdType struct {
	value *OrdType
	isSet bool
}

func (v NullableOrdType) Get() *OrdType {
	return v.value
}

func (v *NullableOrdType) Set(val *OrdType) {
	v.value = val
	v.isSet = true
}

func (v NullableOrdType) IsSet() bool {
	return v.isSet
}

func (v *NullableOrdType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOrdType(val *OrdType) *NullableOrdType {
	return &NullableOrdType{value: val, isSet: true}
}

func (v NullableOrdType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOrdType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

