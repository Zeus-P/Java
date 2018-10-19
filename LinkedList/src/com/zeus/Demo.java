package com.zeus;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<String>();
        addInOrder(places,"Delhi");
        addInOrder(places,"Agra");
        addInOrder(places,"Jaipur");
        addInOrder(places,"Kanpur");
        printList(places);
//        places.remove(3);
  //      printList(places);
    //    places.add(1,"Noida");
        addInOrder(places,"Alice");
        addInOrder(places,"Agra");
        printList(places);
        visit(places);

    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now Visiting " + i.next());
        }
        System.out.println("==================================");


    }

    public static boolean addInOrder(LinkedList<String> linkedList,String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            //If You don't wanna add Duplicates
          /*  if(comparison==0){
                //Dupllicates Can't add

                System.out.println(newCity + " is already included as a destination");
                return true;
            }*/
          //Please remove '=' from next statement if you want prior one choice.
            if(comparison >= 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparison < 0){
                //Move on to next City
            }
        }
        stringListIterator.add(newCity);

        return true;

    }
    public static void visit(LinkedList<String> cities){
        Scanner sc = new Scanner(System.in);
        boolean goingForward = true;
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No Cities is the Itenerary");
            return;
        }else{
            System.out.println("Now Visiting "+listIterator.next());
            printMenu();
        }
        while(!quit) {
            int action = sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday Over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward= true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now Visiting " + listIterator.next());

                    } else {
                        System.out.println("Reached at the end of list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward=false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now Visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }

    }
        private static void printMenu(){
            System.out.println("Available Options:\nPress ");
            System.out.println("0 - To quit\n"+
                    "1 - go to next city\n"+
                    "2 - go to previous city\n"+
                    "3 - print menu options");
        }
}
