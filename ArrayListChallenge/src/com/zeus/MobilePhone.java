package com.zeus;

import java.util.ArrayList;

public class MobilePhone {
    String myNumber;
    public ArrayList<Contact> myContacts;

    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact Already Exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);

    }

    private int findContact(String contactName){
         for(int i =0;i<this.myContacts.size();i++){
            Contact contact  = this.myContacts.get(i);
            if(contact.getName().equals(contactName))
                return i;
        }
        return -1;
    }
    public boolean removeContact(Contact contact){
        int findPosition = findContact(contact);
        if(findPosition < 0){
            System.out.println(contact.getName()+ "was not found");
            return false;
        }
        this.myContacts.remove(contact);
        System.out.println(contact.getName()+ " was deleted.");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println("Sorry" + oldContact.getName()+" Not Found");
            return false;
        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println("Record was Successfully replaced with "  +newContact.getName());
        return true;
    }

    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String contactName){
        int position=findContact(contactName);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List");
        for(int i = 0;i<this.myContacts.size();i++){
            System.out.println((i+1)+". "+this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNo());
        }
    }
}

