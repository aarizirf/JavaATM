package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ATM a = new ATM();
        a.openAccount(1);
        System.out.println(a.checkBalance(1));
        a.depositMoney(1, 200);
        System.out.println(a.checkBalance(1));
        a.withdrawMoney(1, 200);
        System.out.println(a.checkBalance(1));
        a.withdrawMoney(1, 400);
        System.out.println(a.checkBalance(1));
        a.closeAccount(1);
        System.out.println(a.checkBalance(1));
    }
}
