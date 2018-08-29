package com.zeus;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car( int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}

class Mitshubitshi extends Car{
    public Mitshubitshi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitshubitshhi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitshubitshi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitshubitshi -> brake()";
    }
}
class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+" startEngine()";
    }

    @Override
    public String accelerate() {
        return  getClass().getSimpleName() + " accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

    public class Main {

        public static void main(String[] args) {
            // write your code here
            Car car = new Car(8, "Base Car");
            System.out.println(car.startEngine());
            System.out.println(car.accelerate());
            System.out.println(car.brake());
            Mitshubitshi mitsu = new Mitshubitshi(6, "VRW 4WD");
            System.out.println(mitsu.startEngine());
            System.out.println(mitsu.accelerate());
            System.out.println(mitsu.brake());
            Ford ford = new Ford(6, "Figo");
            System.out.println(ford.startEngine());
            System.out.println(ford.accelerate());
            System.out.println(ford.brake());


        }

    }



