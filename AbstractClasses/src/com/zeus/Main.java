package com.zeus;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Das");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

    }
}
