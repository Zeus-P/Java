package com.zeus;

public class Pllayer {
    public String name;
    public int health;
    public String Weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player Knocked Out");
        }
    }
    public int remainingHealth(){
        return this.health;
    }
}
