package com.codekul.Spring6DecBatch.mongo.service;

import com.codekul.Spring6DecBatch.mongo.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<?> createUser(User user);

    ResponseEntity<?> getUserByNameAndDesignation(String name,String designation);

    ResponseEntity<?> getUsersByCity(String city);
}
