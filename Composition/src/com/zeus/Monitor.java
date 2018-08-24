package com.zeus;

public class Monitor {
private int size;
private String model;
private String manufacturer;
private Resolution nativeResolution;

    public Monitor(int size, String model, String manufacturer, Resolution nativeResolution) {
        this.size = size;
        this.model = model;
        this.manufacturer = manufacturer;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing Pixel at "+ "x = "+x+ ", y = "+ y + "in color "+ color);
    }

    public int getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}

