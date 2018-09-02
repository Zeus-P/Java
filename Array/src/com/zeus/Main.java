package com.zeus;
import java.util.Scanner;
public class Main {
	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myArray = {1,2,3,4,5,6,7,8,9,5};
	    myArray[0] = 55;
	    myArray[4]=78;
	    myArray[6]=67;
		for(int i = 0;i<10;i++)
			myArray[i]=i;
        System.out.println(myArray[8]);
		System.out.println(myArray[6]);
		double[] myDoubleArray = new double[10];
		printArray(myArray);

		int[] array2 = getIntegers(5);

		for(int i =0;i<array2.length;i++){
			System.out.println("Elememt "+i+" is "+array2[i]);

		}
		System.out.println("Average is "+getAverage(array2));

	}
	public static void printArray(int[] array){
    	for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
	public static int[] getIntegers(int numbers){
		System.out.println("Enter values of "+ numbers+ " Elements.\r");
		int[] values = new int[numbers];
		for(int i = 0;i<values.length;i++){
			values[i]= scanner.nextInt();
		}
		return values;
	}
	public static double getAverage(int[] array){
		int sum =0;
		for(int i =0;i<array.length;i++){
			sum += array[i];
		}
		return ((double)sum/(double)array.length);
	}
}
