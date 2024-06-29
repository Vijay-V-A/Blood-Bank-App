package com.vijay.bloodBank;

public class CardData {
    private String name;
    private String bloodGroup;
    private String email;
    private String mobileNumber;
    private String location;

    public CardData(String name, String bloodGroup, String email, String mobileNumber, String location) {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getLocation() {
        return location;
    }
}
