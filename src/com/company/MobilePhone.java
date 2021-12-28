package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class MobilePhone {


    ArrayList<Contacts> contacts = new ArrayList<>();
    private String MyNumber;

    public MobilePhone(String myNumber) {
        this.MyNumber = myNumber;
        this.contacts = new ArrayList<>();
    }


    public ArrayList<Contacts> getContacts() {
        return contacts;
    }

    public boolean StoreNewContact(Contacts contact){
        int indexOfContact = findContact(contact.getName());
        if( indexOfContact >= 0){
            System.out.println("contact is alreay on file");
            return false;

        }

       this.contacts.add(contact);
        return true;


    }

    public int findContact(String contactName){
        for(int i = 0; i< this.contacts.size(); i++){
            Contacts contact = this.contacts.get(i);

            if(contact.getName().equals(contactName)){
                return i;
            }


        }

        return -1;
    }


    public int findContact(Contacts contacts){
        return this.contacts.indexOf(contacts);
    }


    public boolean updataContact(Contacts oldContact, Contacts newContact){
        int postion = findContact(oldContact.getName());
        if(postion > 0 ){
            return false;
        }
        this.contacts.set(postion, newContact);
        return true;


    }



    public String printContact(){

        for(int i =0; i< this.contacts.size(); i++){
            System.out.println("Name: " + contacts.get(i).getName() + " Phone Number: " + contacts.get(i).getPhonenumber());
        }
        return null;
    }





}