package com.codekul.Spring6DecBatch.mongo.embedded;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
    private String buildingName;
    public Integer flatNo;
    public String landmark;
}
