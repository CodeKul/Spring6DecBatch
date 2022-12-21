package com.codekul.Spring6DecBatch.jpa.relationships.controller;

import com.codekul.Spring6DecBatch.jpa.relationships.entity.Capital;
import com.codekul.Spring6DecBatch.jpa.relationships.service.CapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/capital")
public class CapitalController {
    @Autowired
    private CapitalService capitalService;
    @PostMapping
    public Map<String,Object> saveCapital(@RequestBody Capital capital){
        return capitalService.saveCapital(capital);
    }
}
