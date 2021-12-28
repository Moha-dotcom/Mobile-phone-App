package com.company;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Contacts.CreateContact;

public class Main {

    private static  Contacts contacts;
    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("9951951");

    public static void main(String[] args) {



       boolean quit = false;

       int chooice = 0;

       while (!quit){

           System.out.println("Choice an Option: ");

           try{
               chooice = scan.nextInt();
               scan.nextLine();
           }catch (InputMismatchException ex){
               System.out.println("Try Again");
           }


           switch (chooice){
               case 0:
                   creatNewContact();
                   break;

               case 1:
                   mobilePhone.printContact();
                   break;

               case 2:
                   updatingInfo();
                   break;

               case 3:
                   quit = true;
                   break;
               default:
                   break;
           }
       }






    }


    public  static Contacts creatNewContact() {
        System.out.println("Enter Name of the Contact: ");
        String name = scan.next();
        System.out.println("Enter Phonenumber of the Contact: ");
        String phonenumber = scan.next();
        Contacts contacts = CreateContact(phonenumber, name);
        mobilePhone.StoreNewContact(contacts);
        return contacts;


    }


    public static void updatingInfo(){
        System.out.println("Enter Old Contact name: ");
        String name = scan.next();
        int i = mobilePhone.findContact(name);
        Contacts OldContact = mobilePhone.getContacts().get(i);

        mobilePhone.updataContact(OldContact , CreateNewContact());


    }

    public static Contacts CreateNewContact(){
        System.out.println("Enter Name of the Contact: ");
        String name1 = scan.next();
        System.out.println("Enter Phonenumber of the Contact: ");
        String phonenumber1 = scan.next();

        Contacts newContact = CreateContact(phonenumber1, name1);

        return newContact;
    }
}