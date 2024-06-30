package com.vijay.bloodbank.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vijay.bloodbank.model.NotificationModel;

@RequestMapping("api/vi")
public class NotificationController {

     @GetMapping("/notication")
     public ArrayList<NotificationModel> getAllNotification(@RequestParam("userId") String userId) {
          return new ArrayList<>();
     }
}
