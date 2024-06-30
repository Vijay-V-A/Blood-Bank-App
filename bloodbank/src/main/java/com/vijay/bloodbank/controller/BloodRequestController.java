package com.vijay.bloodbank.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vijay.bloodbank.model.BloodRequestModel;

@RequestMapping("api/v1")
public class BloodRequestController {

     @PostMapping("/blood-request")
     public String createBloodRequest(@RequestBody BloodRequestModel data) {
          return "request submitted";
     }

}
