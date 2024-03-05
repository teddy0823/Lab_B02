package com.fsse2401.lab_b02.data.domainObject;

public class CreatePersonResponseData {
    private String firstName;
    private String lastName;
    private String hkid;

    public CreatePersonResponseData(String firstName, String lastName, String hkid) {
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
