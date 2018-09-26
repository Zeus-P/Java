package com.zeus;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {
	    boolean quit  = false;
	    startPhone();
	    printActions();
	    while(!quit){
            System.out.println("Enter action : (6 to print all Available actions)");
            int action  = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0 :
                    System.out.println("Shutting Down..........");
                    quit= true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();;
                    break;
            }
        }

    }
    private static void addNewContact() {
        System.out.println("Enter Contact name : ");
        String name  = scanner.nextLine();
        System.out.println("Enter Contact No. ");
        String phone  = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println(name + " added Succesfully.");

        }
        else
            System.out.println(name + " Already Exists! Error!");
    }
    public static void updateContact(){
        System.out.println("Enter Existing contact name : ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact Not Found return");
            return;
        }
        System.out.println("Enter New Contact Name : ");
        String newName = scanner.nextLine();
        System.out.println("Enter New Contact No :");
        String newPhone = scanner.nextLine();
        Contact newContact  = Contact.createContact(newName,newPhone);
        if(mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Successfully Updated record");
        }
        else
            System.out.println("Could not updated ! error!");
    }
    public static void removeContact() {
        System.out.println("Enter Existing contact name : ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact Not Found return");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully Deleted.");
        } else
            System.out.println("Error Deleting Contact.");
    }
    public static void queryContact() {
        System.out.println("Enter Existing contact name : ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact Not Found return");
            return;
        }
        System.out.println("Name : " + existingContactRecord.getName() + " phone number is" + existingContactRecord.getPhoneNo());
    }
    private static void startPhone(){
        System.out.println("Starting Phone.......");

    }

    private static void printActions(){
        System.out.println("\nAvailable Actions\npress");
        System.out.println("0 - To Shut Down\n"+
                            "1 - To Print Contact\n"+
                            "2 - To add Contact\n"+
                            "3 - To Update an Existing Contact\n"+
                            "4 - To Remove an Contact\n"+
                            "5 - To query an Existing Contact\n"+
                            "6 - To print All Available Actions\n");
        System.out.println("Choose Your Action : ");
    }

}
