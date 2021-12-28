package com.company;

import java.util.Collection;

public class Contacts {

    private String phonenumber;
    private String name;


    public Contacts(String phonenumber, String name) {
        this.phonenumber = phonenumber;
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getName() {
        return name;
    }

    public static  Contacts CreateContact(String phonenumber, String name){
        return new Contacts(phonenumber, name);
    }
}


