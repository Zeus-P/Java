package com.zeus;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount Account1=new BankAccount();
        System.out.println(Account1.getbal());
        System.out.println(Account1.getname());
        Account1.getvals(35800100010009L,58000L,"Priyanshu Srivastav","priyanshusrivastav666@gmail.com","8077592157");
        System.out.println("Account No. "+Account1.getacc()+"\nBalance : "+Account1.getbal()+"\nCustomer Name : "+Account1.getname()+"\nEmail : "+Account1.getemail()+"\nContact No. "+Account1
        .getph());

        Account1.depFunds(20000);
        System.out.println("Account No. "+Account1.getacc()+"\nBalance : "+Account1.getbal()+"\nCustomer Name : "+Account1.getname()+"\nEmail : "+Account1.getemail()+"\nContact No. "+Account1
                .getph());
        Account1.withdrawFunds(79000);
        Account1.withdrawFunds(56000);
        System.out.println("Account No. "+Account1.getacc()+"\nBalance : "+Account1.getbal()+"\nCustomer Name : "+Account1.getname()+"\nEmail : "+Account1.getemail()+"\nContact No. "+Account1
                .getph());
    }
}
