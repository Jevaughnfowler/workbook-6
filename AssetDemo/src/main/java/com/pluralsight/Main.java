package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Portfolio p = new Portfolio("Jevaughns Portfolio", "Jevaughn");
        CreditCard creditcard1 = new CreditCard();
        creditcard1.spend(2000);

        p.add( new Gold(1));
        p.add(new Jewelry("Necklace", 2));
        p.add(new House(2000, 2500, 3));
        p.add(creditcard1);


        System.out.println("The total value of the portfolio is " + p.getValue());


    }
}