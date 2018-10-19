package com.zeus;

public class Main {

    public static void main(String[] args) {
	ITelephone pPhone;
    pPhone = new DeskPhone(123456);
    pPhone.powerOn();
    pPhone.callPhone(123456);
    pPhone.answer();

    pPhone = new MobilePhone(234556);
    pPhone.powerOn();
    pPhone.callPhone(234556);
    pPhone.answer();

    }
}
