package com.zeus;

public class Main {

    public static void main(String[] args) {
	    Pllayer player = new Pllayer();
	    player.name = "Priyanshu";
	    player.health = 20;
	    player.Weapon = "Sword";

	    int dam = 10;
        player.loseHealth(dam);
        System.out.println("Remaining Health is "+player.remainingHealth());

        dam = 11;
        player.loseHealth(dam);
        System.out.println("Remaining Health is "+player.remainingHealth());
        EnhancedPlayer player2 =new EnhancedPlayer("ZeuS",100,"Gun");
        System.out.println("Initial Health is "+player2.getHealth());
        player2.loseHealth(20);
        System.out.println("Remaining Health is "+ player2.remainingHealth());


    }
}
