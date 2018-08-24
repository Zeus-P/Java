package com.zeus;

public class Motherboard {
    private String model;
    private String maufacturer;
    private  int ramSlots;
    private int cardSlots;
    private String bios;

    public void loadPrograms(String programName){
        System.out.println("Program "+programName + " is now loading.......");
    }

    public String getModel() {
        return model;
    }

    public String getMaufacturer() {
        return maufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public Motherboard(String model, String maufacturer, int ramSlots, int cardSlots, String bios) {

        this.model = model;
        this.maufacturer = maufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
}
