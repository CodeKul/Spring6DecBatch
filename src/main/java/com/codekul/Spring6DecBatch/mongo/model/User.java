package com.codekul.Spring6DecBatch.mongo.model;

import com.codekul.Spring6DecBatch.mongo.embedded.Address;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    @Id
    private String id;
    private String name;
    private String designation;
    private String email;
    private String mobile;
    private Address permanentAddress;
    private Address correspondingAddress;
}
