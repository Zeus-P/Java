package com.zeus;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private boolean clutchIn;
    private int currentgear = 0;
    //private int gearNumber =0;  //Shadow of Declaration of the outer Class.

    public Gearbox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in){
        this.clutchIn = in;
    }

    public void addGear(int number , double ratio){
        if((number > 0 )&&(number<=maxGears)){
            this.gears.add(new Gear(number,ratio));
        }
    }

    public void changeGear(int newGear){
        if((newGear >= 0 ) && (newGear < this.gears.size()) && this.clutchIn){
            this.currentgear = newGear;
            System.out.println("Gear "+newGear+" Selected.");

        }else{
            System.out.println("Grind!");
            this.currentgear = 0;
        }
    }
    public double wheelSpeed(int revs){
        if(clutchIn) {
            System.out.println("Scream!!");
            return 0.0;
        }
        return revs * gears.get(currentgear).getRatio();
    }

    private class Gear {
        private int gearNumber; //Shadowing gearNumber in the gearbox class
        private double ratio;

        public double getRatio() {
            return ratio;
        }

        public Gear(int gearNumber, double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs*(this.ratio);
        }
    }
}
