package com.zeus;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe","Sausage & Bacon", 14.56, "White");
        super.addHamburgerAddition1("Chips",6.75);
        super.addHamburgerAddition2("Drink",8.0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add extra items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add extra items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add extra items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add extra items to deluxe burger");
    }
}
