package com.codekul.Spring6DecBatch.jpa.relationships.service.impl;

import com.codekul.Spring6DecBatch.jpa.relationships.entity.Capital;
import com.codekul.Spring6DecBatch.jpa.relationships.repository.CapitalRepository;
import com.codekul.Spring6DecBatch.jpa.relationships.service.CapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.codekul.Spring6DecBatch.util.Constants.MESSAGE;
import static com.codekul.Spring6DecBatch.util.Constants.STATUS;

@Service
public class CapitalImpl implements CapitalService {
    @Autowired
    private CapitalRepository capitalRepository;
    @Override
    public Map<String, Object> saveCapital(Capital capital) {
        Map<String,Object> map = new HashMap<>();
        map.put(MESSAGE,"Capital Saved Successfully");
        map.put(STATUS, HttpStatus.CREATED.value());
        capitalRepository.save(capital);
        return map;
    }
}
