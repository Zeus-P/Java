package com.zeus;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }
    //Same Thing can Be Achieved through getter But More Complicated.
    @Override
    public String toString() {
        return this.title +": "+this.duration;
    }
}

