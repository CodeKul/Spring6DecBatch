package com.codekul.Spring6DecBatch.mongo.repository;

import com.codekul.Spring6DecBatch.mongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
