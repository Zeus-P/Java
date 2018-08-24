package com.zeus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(50,false);
        System.out.println("Initial Pages Count = "+printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("pages printed was "+ pagesPrinted+" New Total print count for printer = "+printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("pages printed was "+ pagesPrinted+" New Total print count for printer = "+printer.getPagesPrinted());
    }
}
