package com.vijay.bloodbank.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vijay.bloodbank.model.NotificationModel;

public interface NotificationRepository extends MongoRepository<NotificationModel, String> {

}