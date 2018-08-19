package com.zeus;

public class BankAccount
{
        private long acc_no;
        private long bal;
        private String custname;
        private String email;
        private String phno;

        //getter
        public void getvals(long acc_no,long bal,String custname,String email,String phno ){
            this.acc_no=acc_no;
            this.bal=bal;
            this.custname=custname;
            this.email=email;
            this.phno=phno;

        }
        //Setter
        public long getacc(){
            return this.acc_no;
        }
        public long getbal(){
            return this.bal;
        }
        public String getname(){
            return this.custname;

        }
        public String getemail(){
            return this.email;
        }
        public String getph(){
            return this.phno;
        }
        public long  depFunds(long funds){
            this.bal += funds;
            System.out.println("Your Funds have been Deposited !");
            return this.bal;
        }
        public long withdrawFunds(long funds){
            if(this.bal>funds){
                return (this.bal -= funds);
            }
            else{
                System.out.println("Amount Insufficient !");
                return this.bal;
            }
        }

    }
