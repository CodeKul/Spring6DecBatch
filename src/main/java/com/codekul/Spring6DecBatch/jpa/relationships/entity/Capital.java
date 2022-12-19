package com.codekul.Spring6DecBatch.jpa.relationships.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Capital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String capital;
    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country;
}
