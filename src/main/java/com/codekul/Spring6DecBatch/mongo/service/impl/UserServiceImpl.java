package com.codekul.Spring6DecBatch.mongo.service.impl;

import com.codekul.Spring6DecBatch.mongo.model.User;
import com.codekul.Spring6DecBatch.mongo.repository.UserRepository;
import com.codekul.Spring6DecBatch.mongo.service.UserService;
import com.codekul.Spring6DecBatch.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public ResponseEntity<?> createUser(User user) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("User Created Successfully");
        apiResponse.setStatus(HttpStatus.CREATED.value());
        userRepository.save(user);
        return ResponseEntity.ok(apiResponse);
    }

    @Override
    public ResponseEntity<?> getUserByNameAndDesignation(String name, String designation) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("User Found");
        apiResponse.setStatus(HttpStatus.OK.value());
        apiResponse.setResult(userRepository.findByNameAndDesignation(name,designation));
        return ResponseEntity.ok(apiResponse);
    }
}
