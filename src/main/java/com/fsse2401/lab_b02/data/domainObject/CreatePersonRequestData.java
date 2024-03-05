package com.fsse2401.lab_b02.data.domainObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePersonRequestData {
    private String firstName;
    private String lastName;
    private String hkid;
    public CreatePersonRequestData(String firstName, String lastName, String hkid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hkid = hkid;
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

    public String getHkid() {
        return hkid;
    }

    public void setHkid(String hkid) {
        this.hkid = hkid;
    }
}
