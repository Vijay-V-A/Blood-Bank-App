package com.vijay.bloodbank.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.bloodbank.model.UserModel;
import com.vijay.bloodbank.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {

     @Autowired
     private UserService userservice;

     @PostMapping("/users")
     public UserModel postUser(@RequestBody UserModel data) {

          return userservice.postUserDetails(data);
     }

     @PutMapping("/users/{id}")
     public UserModel updateUser(@RequestBody UserModel data, @PathVariable("id") String id) {
          return userservice.updateUserDetails(data, id);
     }

     @GetMapping("/users")
     public List<UserModel> getAllUser() {
          return userservice.getAllUserDetails();
     }

     @GetMapping("/users/{id}")
     public Optional<UserModel> getOneUser(@PathVariable("id") String id) {
          return userservice.getOneUserDetail(id);
     }

     @DeleteMapping("/users/{id}")
     public String deleteUser(@PathVariable("id") String id) {
          userservice.deleteUserDetail(id);
          return "User data Deleted";
     }

}
