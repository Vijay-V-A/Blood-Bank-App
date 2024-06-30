package com.vijay.bloodbank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vijay.bloodbank.model.UserModel;
import com.vijay.bloodbank.repository.UserRepository;

@Service
public class UserService {
     @Autowired
     private UserRepository user;

     public UserModel postUserDetails(UserModel data) {
          return user.save(data);
     }

     public UserModel updateUserDetails(UserModel data, String id) {
          data.setId(id);
          return user.save(data);
     }

     public List<UserModel> getAllUserDetails() {
          return user.findAll();
     }

     public Optional<UserModel> getOneUserDetail(String id) {
          return user.findById(id);
     }

     public String deleteUserDetail(String id) {
          user.deleteById(id);
          return "User data Deleted";
     }
}
