package com.codekul.Spring6DecBatch.jpa.relationships.service;

import com.codekul.Spring6DecBatch.jpa.relationships.entity.Country;

import java.util.List;

public interface CountryService {
    String saveCountry(Country country);

    List<Country> findAll();

    Country findByCountryName(String country);
    //void findAll();
}
