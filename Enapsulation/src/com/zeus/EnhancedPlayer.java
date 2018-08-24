package com.zeus;

public class EnhancedPlayer {
    private String Name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.Name = name;

        if(health >0 && health <= 100){
            this.health = health;
        }
        this.weapon=weapon;




    }
    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player Knocked Out");
        }
    }
    public int remainingHealth(){
        return this.health;
    }

    public String getName() {
        return Name;
    }

    public int getHealth() {
        return this.health;
    }

    public String getWeapon() {
        return weapon;
    }
}
