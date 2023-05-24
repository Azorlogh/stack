/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DummyPayConfig {
    @JsonProperty("directory")
    public String directory;

    public DummyPayConfig withDirectory(String directory) {
        this.directory = directory;
        return this;
    }
    
    /**
     * The frequency at which the connector will create new payment objects in the directory
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fileGenerationPeriod")
    public String fileGenerationPeriod;

    public DummyPayConfig withFileGenerationPeriod(String fileGenerationPeriod) {
        this.fileGenerationPeriod = fileGenerationPeriod;
        return this;
    }
    
    /**
     * The frequency at which the connector will try to fetch new payment objects from the directory
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filePollingPeriod")
    public String filePollingPeriod;

    public DummyPayConfig withFilePollingPeriod(String filePollingPeriod) {
        this.filePollingPeriod = filePollingPeriod;
        return this;
    }
    
    public DummyPayConfig(@JsonProperty("directory") String directory) {
        this.directory = directory;
  }
}