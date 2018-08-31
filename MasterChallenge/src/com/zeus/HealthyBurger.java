package com.zeus;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1priice;
    private String healthyExtra2Name;
    private double healthyExtra2priice;

    public HealthyBurger(String meat, double price) {
        super("Healty", meat, price,"brown Rye");

    }
    public void addhealthAddition1(String name,double price){
        this.healthyExtra1Name=name;
        this.healthyExtra1priice=price;
    }
    public void addhealthAddition2(String name,double price){
        this.healthyExtra2Name=name;
        this.healthyExtra2priice=price;
    }

    @Override
    public double itemizeHamburger() {
        double price = super.itemizeHamburger();
        if(this.healthyExtra1Name != null){
            price += this.healthyExtra1priice;
            System.out.println("Added "+ this.healthyExtra1Name+" for a extra "+this.healthyExtra1priice
            );
        }
        if(this.healthyExtra2Name != null) {
            price += this.healthyExtra2priice;
            System.out.println("Added "+ this.healthyExtra1Name+" for a extra "+this.healthyExtra1priice
            );
        }
        return price;

    }
}
