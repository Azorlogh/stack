/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;

public class GetBalanceRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=balanceName")
    public String balanceName;

    public GetBalanceRequest withBalanceName(String balanceName) {
        this.balanceName = balanceName;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public GetBalanceRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public GetBalanceRequest(@JsonProperty("balanceName") String balanceName, @JsonProperty("id") String id) {
        this.balanceName = balanceName;
        this.id = id;
  }
}