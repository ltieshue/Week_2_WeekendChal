package com.company;

public class memberInfo {
    public String accountNumber;
    public String memberName;
    private double memberBalance;

    public memberInfo(String accountNumber, String memberName, double memberBalance) {
        this.accountNumber = accountNumber;
        this.memberName = memberName;
        this.memberBalance = memberBalance;

    }
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
@Override
    public String toString(){
        return memberName + " has " + memberBalance;

}


}




