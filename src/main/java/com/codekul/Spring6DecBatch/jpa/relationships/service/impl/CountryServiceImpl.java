package com.codekul.Spring6DecBatch.jpa.relationships.service.impl;

import com.codekul.Spring6DecBatch.jpa.relationships.entity.Country;
import com.codekul.Spring6DecBatch.jpa.relationships.repository.CountryRepository;
import com.codekul.Spring6DecBatch.jpa.relationships.service.CountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;


    @Override
    public String saveCountry(Country country) {
        countryRepository.save(country);
        log.info("Country saved successfully");
        return "Country saved successfully";
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country findByCountryName(String country) {
        return countryRepository.findByCountryName(country);
    }
}
