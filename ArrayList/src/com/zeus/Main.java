package com.zeus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
	    boolean quit = false;
	    int choice  =0;
	    printInstructions();
	    while(!quit){
            System.out.println("Enter Your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0 : printInstructions();
                break;
                case 1: groceryList.printGroceryList();
                break;
                case 2: addItems();
                break;
                case 3:modifyItems();
                break;
                case 4:removeItem();
                break;
                case 5:searchForItem();
                break;
                case 6 : processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;

            }
        }
    }
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 1 - To print The List of grocery Items.");
        System.out.println("\t 2 - To add an item To list.");
        System.out.println("\t 3 - To Modify an item in the list.");
        System.out.println("\t 4 - To Remove An Item From List.");
        System.out.println("\t 5 - To Search For an Item in the List.");
        System.out.println("\t 6 - Process to copy arrayList to another ArrayList and in array.");
        System.out.println("\t 7 - To quit The Application.");
    }
    public static void addItems(){
        System.out.println("Please Enter The grocery Item : ");
        String a = scanner.nextLine();
        groceryList.addGroceryItem(a);
    }
    public static void modifyItems(){
        System.out.println("Enter The current Item : ");
        String item = scanner.nextLine();
        System.out.println("Enter new Item Item : ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(item,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter The Item: ");
        String item = scanner.nextLine();

        groceryList.removeGroceryItem(item);
    }
    public static void searchForItem(){
        System.out.println("Item To Search for : ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)!= false){
            System.out.println("Found "+searchItem + " in the grocery List");
        }
        else
            System.out.println(searchItem+" is not in grocery List");
    }
    public static void processArrayList(){
        ArrayList<String> newArray  = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> newArray2 = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
