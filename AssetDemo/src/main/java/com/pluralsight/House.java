package com.pluralsight;

public class House extends FixedAsset{
    private int yearBuilt;
    private int squareFeet;
    private int bedRooms;

    public House(int yearBuilt, int squareFeet, int bedRooms) {
        super("House", 0);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }

    @Override
    public double getValue() {
        return squareFeet * 200;
    }
}
