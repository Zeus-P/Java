package com.zeus;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseArray = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers : ");
        getInput();
        printArray(baseArray);
        resizeArray();
        System.out.println("Enter 12 Integers : ");
        getInput();
        printArray(baseArray);

    }
    private static void getInput(){
        for(int i = 0;i<baseArray.length;i++){
            baseArray[i]= scanner.nextInt();
        }
    }
    private static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void resizeArray(){
        int[] original = baseArray;
        baseArray = new int[12];
        for(int i =0 ; i<original.length;i++){
            baseArray[i]= original[i];
        }

    }
}
