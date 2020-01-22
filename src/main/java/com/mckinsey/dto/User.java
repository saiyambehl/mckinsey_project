package com.mckinsey.dto;

import java.util.Date;

public class User {
    private String name;
    private UserType userType;
    private String address;
    private String phone;
    private Date dateOfJoining;

    public User(String name, UserType userType, String address, String phone, Date dateOfJoining) {
        this.name = name;
        this.userType = userType;
        this.address = address;
        this.phone = phone;
        this.dateOfJoining = dateOfJoining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
