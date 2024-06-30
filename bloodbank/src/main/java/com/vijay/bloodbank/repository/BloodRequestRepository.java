package com.vijay.bloodbank.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vijay.bloodbank.model.BloodRequestModel;

public interface BloodRequestRepository extends MongoRepository<BloodRequestModel, String> {

}
