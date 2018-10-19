package com.zeus;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Priyanshu",54.97);
        Customer anotherCustomer ;
        anotherCustomer = customer;
        anotherCustomer.setBalance(45.56);
        System.out.println("Balance for customer "+customer.getName()+" is "+customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for(int i = 0;i<intList.size();i++){
            System.out.println(i+ ": "+intList.get(i));
        }

        intList.add(1,2);

        for(int i = 0;i<intList.size();i++){
            System.out.println(i+ ": "+intList.get(i));
        }

    }
}
