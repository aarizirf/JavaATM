package com.company;

import java.util.HashMap;

public class ATM {
    HashMap<Integer, Double> accounts;

    public ATM() {
        accounts = new HashMap<>();
    }

    public void openAccount(int id) {
        if(accounts.containsKey(id)) return;
        accounts.put(id, 0.0);
    }

    public void openAccount(int id, double amt) {
        accounts.put(id, amt);
    }

    public void closeAccount(int id) {
        if(accounts.containsKey(id)) {
            if(accounts.get(id) == 0.0) {
                accounts.remove(id);
            }
        }
    }

    public double checkBalance(int id) {
        if(accounts.containsKey(id)) {
//            return accounts.get(id);
            return 0.01 * Math.floor(accounts.get(id) * 100.0);
        } else return 0.0;
    }

    public boolean depositMoney(int id, double amt) {
        if(amt <= 0) return false;
        if(accounts.containsKey(id)) {
            accounts.put(id, accounts.get(id) + amt);
            return true;
        } else return false;
    }

    public boolean withdrawMoney(int id, double amt) {
        if(amt<=0) return false;
        if(accounts.containsKey(id)) {
            double money = accounts.get(id);
            if(amt > money) return false;
            accounts.put(id, money - amt);
            return true;
        } else return false;
    }
}
