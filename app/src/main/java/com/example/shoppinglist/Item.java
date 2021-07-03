package com.example.shoppinglist;

public class Item {

    private String name;
    private boolean isChecked = false;
    private int id;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public int getId() {
        return id;
    }
}
