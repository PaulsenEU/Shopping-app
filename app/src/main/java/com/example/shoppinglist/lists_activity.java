package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class lists_activity extends AppCompatActivity  {


    private RecyclerView listRecyclerView;
    private ListRecyclerViewAdapter adapter;
    private ArrayList<ShoppingArray> shoppingLists = new ArrayList<>();
    private ListRecyclerViewAdapter.RecyclerViewClickListener listener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        adapter = new ListRecyclerViewAdapter(this, listener);
        listRecyclerView = findViewById(R.id.listRecyclerView);

        listRecyclerView.setAdapter(adapter);
        listRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        ShoppingArray list  = new ShoppingArray();

        shoppingLists.add(list);


        adapter.setShoppingLists(shoppingLists);

    }

    private void setOnClickListener() {
        listener = new ListRecyclerViewAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), shopping_list_activity.class);
                startActivity(intent);
            }
        };
    }
}