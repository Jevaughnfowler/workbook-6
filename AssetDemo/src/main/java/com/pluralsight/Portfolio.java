package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<Valuable>();
    }

    public void add(Valuable valuableThing){
        this.valuables.add(valuableThing);
    }


    public double getValue(){
        double total = 0;
        for(Valuable fa : valuables){
            total += fa.getValue();
        }
        return total;
    }
}