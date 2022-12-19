package com.codekul.Spring6DecBatch.jpa.relationships.controller;

import com.codekul.Spring6DecBatch.jpa.relationships.entity.Country;
import com.codekul.Spring6DecBatch.jpa.relationships.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping
    public String saveCountry(@RequestBody Country country){
        return countryService.saveCountry(country);
    }


    @GetMapping
    public List<Country> findAll(){
        return countryService.findAll();
    }

    @GetMapping("/findByCountryName/{country}")
    public Country findByCountryName(@PathVariable String country){
        return countryService.findByCountryName(country);
    }

}
