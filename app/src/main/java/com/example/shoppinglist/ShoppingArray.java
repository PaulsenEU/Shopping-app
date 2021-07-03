package com.example.shoppinglist;

import java.util.ArrayList;

public class ShoppingArray {

    private ArrayList<Item> itemsList = new ArrayList<Item>();

    public ShoppingArray() {
        //itemsList = new ArrayList<>();
    };

    public ShoppingArray(ArrayList<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public String getName() {
        return "Shopping List";
    }

    public void addToList(Item i) {
        itemsList.add(i);
    }

    public Item getItem(int i) {
        return this.itemsList.get(i);
    }

    public ArrayList<Item> getItemsList() {
        return itemsList;
    }
}
