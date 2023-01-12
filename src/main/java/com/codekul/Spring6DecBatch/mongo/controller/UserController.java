package com.codekul.Spring6DecBatch.mongo.controller;

import com.codekul.Spring6DecBatch.mongo.model.User;
import com.codekul.Spring6DecBatch.mongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public ResponseEntity<?> getUserByNameAndDesignation(@RequestParam String name,
                                                         @RequestParam String designation){
        return userService.getUserByNameAndDesignation(name,designation);
    }

    @GetMapping("/getUsersByCity/{city}")
    public ResponseEntity<?> getUsersByCity(@PathVariable String city){
        return userService.getUsersByCity(city);
    }
}
