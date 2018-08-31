package com.zeus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic","Sausage",3,"White");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.13);
        System.out.println("Toal Burger Price is "+hamburger.itemizeHamburger());

        HealthyBurger healthyBurger=new HealthyBurger("Bacon",4.5);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerAddition1("Eggs",6.5);
        healthyBurger.itemizeHamburger();
        System.out.println("Toal Burger Price is "+healthyBurger.itemizeHamburger());
        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
        System.out.println("Total Price is "+db.itemizeHamburger());
    }
}
