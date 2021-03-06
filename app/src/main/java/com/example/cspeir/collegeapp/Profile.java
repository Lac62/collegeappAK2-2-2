package com.example.cspeir.collegeapp;

import java.util.Date;

/**
 * Created by cspeir on 10/6/2017.
 */

public class Profile extends ApplicantData{
    private String lastName;
    private String firstName;
    private Date mDates;
    public String getFirstName() {
        return firstName;
    }
    private String objectId;
    private String email;
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Profile(){
        firstName = "Cnr";
        lastName = "Spr";
        mDates = new Date();

    }
    public Profile (String first, String last){
        this.firstName = first;
        this.lastName = last;
        mDates = new Date();
    }

    public Date getDates() {
        return mDates;
    }

    public void setDates(Date todaysDate) {
        mDates = todaysDate;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
