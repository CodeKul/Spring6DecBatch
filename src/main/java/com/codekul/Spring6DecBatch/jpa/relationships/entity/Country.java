package com.codekul.Spring6DecBatch.jpa.relationships.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String countryCode;
    @Column(unique = true)
    private String countryName;

}
