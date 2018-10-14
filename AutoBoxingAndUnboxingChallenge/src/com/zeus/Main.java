package com.zeus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("State bank of India");
        bank.addBranch("Agra");
        bank.addCustomer("Agra","Priyanshu",100.50);
        bank.addCustomer("Agra","Piyush",50.60);
        bank.addCustomer("Agra","Rahul",150.00);

        bank.addBranch("Sydney");

        bank.addCustomer("Sydney","Lavy",190);
        bank.addCustomer("Sydney","kanchan",100);

        bank.addCustomerTransaction("Agra","Priyanshu",50);
        bank.addCustomerTransaction("Agra","Piyush",20);
        bank.addCustomerTransaction("Agra","Rahul",50);

        bank.listCustomer("Agra",true);
        bank.listCustomer("Sydney",true);

        if(!bank.addBranch("Agra")){
            System.out.println("Branch Already Exists");
        }
        if(!bank.addCustomerTransaction("Agra","Lavy",20)){
            System.out.println("Customer Does not exist");
        }
        if(!bank.addCustomer("Agra","Priyanshu",100)){
            System.out.println("Customer Already Exists");
        }
    }
}
