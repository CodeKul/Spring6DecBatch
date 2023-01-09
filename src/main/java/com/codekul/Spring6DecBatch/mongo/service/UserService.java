package com.codekul.Spring6DecBatch.mongo.service;

import com.codekul.Spring6DecBatch.mongo.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<?> createUser(User user);
}
