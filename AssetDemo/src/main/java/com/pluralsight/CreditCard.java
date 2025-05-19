package com.pluralsight;

public class CreditCard implements Valuable {

    private double balance;

    public void pay(double amount){
        balance += amount;
    }

    public void spend(double amount){
        balance -= amount;
    }

    public double getValue(){
        return balance;
    }
}
