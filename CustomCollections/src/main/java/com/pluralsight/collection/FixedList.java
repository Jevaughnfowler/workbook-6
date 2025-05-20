package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public boolean add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
            return true;
        } else {
            System.out.println("Cannot add item: list is at max capacity of " + maxSize);
            return false;
        }
    }

    public List<T> getItems() {
        return items;
    }
}