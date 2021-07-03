package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class lists_activity extends AppCompatActivity {

    private RecyclerView listRecyclerView;
    private ListRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        adapter = new ListRecyclerViewAdapter(this);
        listRecyclerView = findViewById(R.id.listRecyclerView);

        listRecyclerView.setAdapter(adapter);
        listRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        ArrayList<String> shoppingList = new ArrayList<>();
        ArrayList<ArrayList<String>> shoppingLists = new ArrayList<>();

        shoppingList.add("Apple");
        shoppingLists.add(new ArrayList<String>());
        //shoppingLists.add(shoppingList);

        adapter.setShoppingLists(shoppingLists);

    }
}