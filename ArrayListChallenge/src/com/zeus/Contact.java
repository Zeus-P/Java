package com.zeus;

public class Contact {
    String name;
    String phoneNo;

    public Contact(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public static Contact createContact(String name,String phoneNo){
        return new Contact(name,phoneNo);
    }
}
