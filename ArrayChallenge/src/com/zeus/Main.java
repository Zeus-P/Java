package com.zeus;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter No. of Elements Do you wanna Sort ? \r");
        int numbers = scanner.nextInt();
        int[] myIntArray = getIntegers(numbers);
        for(int i =0 ; i<myIntArray.length;i++){
            System.out.println("You Entered myIntArray["+i+"] = "+myIntArray[i]);
        }
        int[] sortedArray = getSorted(myIntArray);
        System.out.println("Sorted Elements Are : ");
        for(int i =0 ; i<sortedArray.length;i++){
            System.out.println(sortedArray[i]);
        }
        //Copying An Array
        int[] sortedArray2 = sortedArray;
        System.out.println("Sorted Elements Are : ");
        for(int i =0 ; i<sortedArray2.length;i++){
            System.out.println(sortedArray2[i]);
        }
        //Now nyIntArray is also Sorted.
        System.out.println("Sorted Elements Are : ");
        for(int i =0 ; i<myIntArray.length;i++){
            System.out.println(myIntArray[i]);
        }
    }
    public static int[] getIntegers(int numbers){
        System.out.println("Enter value of Your " +numbers+ " Elements\r");
        int[] array = new int[numbers];
        for(int i =0;i<array.length;i++){
            array[i]  = scanner.nextInt();
        }
        return array;
    }
    public static int[] getSorted(int[] array){


        for(int i =0;i<array.length;i++){
            for(int j= i+1;j<array.length;j++){
                if(array[i]<array[j]){
                    array[i] = array[i]+array[j];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j];
                }
            }
        }
        return array;
    }
}
