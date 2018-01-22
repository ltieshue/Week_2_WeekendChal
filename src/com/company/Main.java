package com.company;



public class Main

{

    public static void main (String[] args) {



memberInfo cust1 = new memberInfo("123", "Lori", 0.0);
memberInfo cust2 = new memberInfo("234", "Kym", 0.0);
memberInfo cust3 = new memberInfo("345", "Joan", 0.0);
memberInfo cust4 = new memberInfo("456", "Koddie", 0.0);
memberInfo cust5 = new memberInfo("567", "Mark", 0.0);
memberInfo cust6 = new memberInfo("678", "Ted", 0.0);
memberInfo cust7 = new memberInfo("789", "Manny", 0.0);
memberInfo cust8 = new memberInfo("890", "Zech", 0.0);
memberInfo cust9 = new memberInfo("901", "Jake", 0.0);
memberInfo cust10 = new memberInfo("012", "Scott", 0.0);


memberInfo[] listofAccounts = {cust1, cust2, cust3, cust4, cust5, cust6, cust7, cust8, cust9, cust10};
            for (int i = 0; i<listofAccounts.length; i++){                    listofAccounts[i].deposit(57000);
                    listofAccounts[i].withdrawal(7000);
                    System.out.println(listofAccounts[i].memberName + "'s Account # is " + listofAccounts[i].accountNumber + ". Account Balance is: $" + listofAccounts[i].getBalance());}



//            cust1.deposit(57000);
//            cust2.deposit(57000);
//            cust3.deposit(57000);
//            cust4.deposit(57000);
//            cust5.deposit(57000);
//            cust6.deposit(57000);
//            cust7.deposit(57000);
//            cust8.deposit(57000);
//            cust9.deposit(57000);
//            cust10.deposit(57000);
//




//            System.out.println(cust1);
//            System.out.println(cust2);
//            System.out.println(cust3);
//            System.out.println(cust4);
//            System.out.println(cust5);
//            System.out.println(cust6);
//            System.out.println(cust7);
//            System.out.println(cust8);
//            System.out.println(cust9);
//            System.out.println(cust10);

                   }
    }

