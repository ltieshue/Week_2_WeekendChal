package com.company;

public class memberInfo {
    public String accountNumber;
    public String memberName;
    private double memberBalance;

    //set balance to
    public memberInfo() {
        memberBalance = 0.0;
    }

    public void withdrawal(double amount) {
        memberBalance = memberBalance - amount;
    }

    public void deposit(double amount) {
        memberBalance = memberBalance + amount;
    }

    //Get Balance
    public double getBalance() {
        return memberBalance;
    }

    public memberInfo(String accountNumber, String memberName, double memberBalance, double withdrawal, double deposit) {
        this.accountNumber = accountNumber;
        this.memberName = memberName;
        this.memberBalance = memberBalance;
    }

}



//public static void main (String[] args) {
//        memberInfo cust1 = new memberInfo();
//        cust1.deposit(57000);
//
//        memberInfo cust2 = new memberInfo();
//        cust2.deposit(57000);
//
//        memberInfo cust3 = new memberInfo();
//        cust3.deposit(57000);
//
//        memberInfo cust4 = new memberInfo();
//        cust4.deposit(57000);
//
//        memberInfo cust5 = new memberInfo();
//        cust5.deposit(57000);
//
//        memberInfo cust6 = new memberInfo();
//        cust6.deposit(57000);
//
//        memberInfo cust7 = new memberInfo();
//        cust7.deposit(57000);
//
//        memberInfo cust8 = new memberInfo();
//        cust8.deposit(57000);
//
//        System.out.println(cust1.getBalance());
//        System.out.println(cust2.getBalance());
//        System.out.println(cust3.getBalance());
//        System.out.println(cust4.getBalance());
//        System.out.println(cust5.getBalance());
//        System.out.println(cust6.getBalance());
//        System.out.println(cust7.getBalance());
//        System.out.println(cust8.getBalance());


//    public memberInfo (String accountNumber, String memberName, double memberBalance, double withdrawal, double deposit){
//        this.accountNumber = accountNumber;
//        this.memberName = memberName;
//        this.memberBalance = memberBalance;
//        this.withdrawal = withdrawal;
//        this.deposit = deposit;















