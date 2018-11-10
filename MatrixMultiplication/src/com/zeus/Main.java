package com.zeus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n;
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Base Of Squared Matrix : ");
        n = scanner.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        System.out.println("Enter the elements of 1st Matrix Row Wise\n");
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter Elements of 2nd Matrix row Wise\n");
        for(int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                b[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Multiplying The matrices............");
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                for (int k = 0;k<n;k++){
                    c[i][j] = c[i][j] + a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Result");
        for (int i = 0;i<n;i++){
            for (int j =0;j<n;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
