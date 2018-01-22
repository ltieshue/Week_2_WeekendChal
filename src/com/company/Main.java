package com.company;



public class Main

{

    public static void main (String[] args) {
	// I thought the variables needed to be defined in the Main, but this didn't work.
            // Therefore the variables were defined on the Class tab, but I kept the code here as well.

//        public String accountNumber;
//        public String memberName;
//        public double memberBalance;
//        public double withdrawal;
//        public double deposit;

//        public memberInfo (String accountNumber, String memberName, double memberBalance, double withdrawal, double deposit)
//        memberInfo1 = ()

// The following comments are to define the cust1-cust9 however it is not updating the actual name.
            // I left it here as a placeholder.

//com.company.memberInfo cust1 = new com.company.memberInfo("123", "Lori", 0.0);
//com.company.memberInfo cust2 = new com.company.memberInfo("234", "Kym", 0.0);
//com.company.memberInfo cust3 = new com.company.memberInfo("345", "Joan", 0.0);
//com.company.memberInfo cust4 = new com.company.memberInfo("456", "Koddie", 0.0);
//com.company.memberInfo cust5 = new com.company.memberInfo("567", "Mark", 0.0);
//com.company.memberInfo cust6 = new com.company.memberInfo("678", "Ted", 0.0);
//com.company.memberInfo cust7 = new com.company.memberInfo("789", "Manny", 0.0);
//com.company.memberInfo cust8 = new com.company.memberInfo("890", "Zech", 0.0);
//com.company.memberInfo cust9 = new com.company.memberInfo("901", "Jake", 0.0);




            com.company.memberInfo cust1 = new com.company.memberInfo();
            cust1.deposit(57000);

            com.company.memberInfo cust2 = new com.company.memberInfo();
            cust2.deposit(57000);

            com.company.memberInfo cust3 = new com.company.memberInfo();
            cust3.deposit(57000);

            com.company.memberInfo cust4 = new com.company.memberInfo();
            cust4.deposit(57000);

            com.company.memberInfo cust5 = new com.company.memberInfo();
            cust5.deposit(57000);

            com.company.memberInfo cust6 = new com.company.memberInfo();
            cust6.deposit(57000);

            com.company.memberInfo cust7 = new com.company.memberInfo();
            cust7.deposit(57000);

            com.company.memberInfo cust8 = new com.company.memberInfo();
            cust8.deposit(57000);

            com.company.memberInfo cust9 = new com.company.memberInfo();
            cust9.deposit(57000);

            System.out.println(cust1.getBalance());
            System.out.println(cust2.getBalance());
            System.out.println(cust3.getBalance());
            System.out.println(cust4.getBalance());
            System.out.println(cust5.getBalance());
            System.out.println(cust6.getBalance());
            System.out.println(cust7.getBalance());
            System.out.println(cust8.getBalance());
            System.out.println(cust9.getBalance());
        }
    }

