package com.zeus;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("5567","DELL","240",dimensions);

        Monitor monitor = new Monitor(27,"Acer","27 inches",new Resolution(2540,1440));


        Motherboard theMotherboard = new Motherboard("BJ-255","Asus",4,6,"v2.44");
        PC thePC = new PC(theCase,theMotherboard,monitor);
        thePC.getMonitor().drawPixelAt(1500,1200,"red");
        thePC.getMotherboard().loadPrograms("VLC Media Player");
        String a= thePC.getTheCase().getPowerSupply();
        System.out.println(a);
        //one More Way to achieve this is here,
        thePC.powerUp();

    }
}
