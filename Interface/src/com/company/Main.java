package com.company;
interface Inter{
    void disp();
}

public class Main {

    public static void main(String[] args) {
	Inter i = ()->{
        System.out.println("I am Executing......");
    };
	i.disp();
	Inter i2 =  ()->{
        System.out.println("I am Executing Again.....");
    };
    i2.disp();
    }
}
