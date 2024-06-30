package com.vijay.bloodbank.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vijay.bloodbank.model.UserModel;

public interface UserRepository extends MongoRepository<UserModel, String> {

}
