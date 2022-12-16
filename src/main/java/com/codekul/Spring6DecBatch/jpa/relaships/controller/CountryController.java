package com.codekul.Spring6DecBatch.jpa.relaships.controller;

import com.codekul.Spring6DecBatch.jpa.relaships.entity.Country;
import com.codekul.Spring6DecBatch.jpa.relaships.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping
    public String saveCountry(@RequestBody Country country){
        return countryService.saveCountry(country);
    }
}
