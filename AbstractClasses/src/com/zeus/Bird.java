package com.zeus;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is Eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " Is Breathing");
        System.out.println(getClass());

    }
    public void fly(){
        System.out.println(getName()+" is Flapping Its Wings.");
    };
}
