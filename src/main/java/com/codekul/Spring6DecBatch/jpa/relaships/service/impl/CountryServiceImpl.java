package com.codekul.Spring6DecBatch.jpa.relaships.service.impl;

import com.codekul.Spring6DecBatch.jpa.relaships.entity.Country;
import com.codekul.Spring6DecBatch.jpa.relaships.repository.CountryRepository;
import com.codekul.Spring6DecBatch.jpa.relaships.service.CountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
