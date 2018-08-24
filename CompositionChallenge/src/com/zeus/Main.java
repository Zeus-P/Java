package com.zeus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12,"red");
        Bed bed  = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic",true,75);

        Bedroom bedRoom = new Bedroom("Zeus",wall1,wall2,wall3,wall3,ceiling,bed,lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}
