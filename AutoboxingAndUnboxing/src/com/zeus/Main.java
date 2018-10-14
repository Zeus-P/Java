package com.zeus;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer integer = new Integer(45);
        Double doubleValue = new Double(12.56);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i =0;i<10;i++){
            arr.add(Integer.valueOf('a'));
        }
        for (int i = 0;i<10;i++){
            System.out.println(i + " --> " + arr.get(i).intValue());
        }
        
    }
}
