package com.vijay.bloodbank.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
     @Id
     private String id;
     private String firstName;
     private String lastName;
     private String email;
     private String dob;
     private String bloodGroup;
     private String location;
     private String password;

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getDob() {
          return dob;
     }

     public void setDob(String dob) {
          this.dob = dob;
     }

     public String getBloodGroup() {
          return bloodGroup;
     }

     public void setBloodGroup(String bloodGroup) {
          this.bloodGroup = bloodGroup;
     }

     public String getLocation() {
          return location;
     }

     public void setLocation(String location) {
          this.location = location;
     }

     public String getPassword() {
          return password;
     }

     public void setPassword(String password) {
          this.password = password;
     }
}
