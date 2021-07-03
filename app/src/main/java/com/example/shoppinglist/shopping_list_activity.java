package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class shopping_list_activity extends AppCompatActivity  {


    private RecyclerView shoppingListRecyclerView;
    private ShoppingListRecyclerViewAdapter adapter;
    private ShoppingArray list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        adapter = new ShoppingListRecyclerViewAdapter(this);
        shoppingListRecyclerView = findViewById(R.id.shoppingListRecyclerView);

        shoppingListRecyclerView.setAdapter(adapter);
        shoppingListRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        list = new ShoppingArray();
        list.addToList(new Item("Apple"));
        adapter.setList(list);


    }
}