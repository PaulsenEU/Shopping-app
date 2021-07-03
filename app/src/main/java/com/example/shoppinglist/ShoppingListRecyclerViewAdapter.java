package com.example.shoppinglist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ShoppingListRecyclerViewAdapter extends RecyclerView.Adapter<ShoppingListRecyclerViewAdapter.ShoppingListRecyclerViewHolder> {

    private ShoppingArray list;
    private Context mContext;

    public ShoppingListRecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ShoppingListRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ShoppingListRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoppingListRecyclerViewAdapter.ShoppingListRecyclerViewHolder holder, int position) {
        holder.checkBox.setText(list.getItem(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.getItemsList().size();
    }

    public void setList(ShoppingArray list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public class ShoppingListRecyclerViewHolder extends RecyclerView.ViewHolder {

        private RelativeLayout parent2;
        private FloatingActionButton fab;
        private CheckBox checkBox;

        public ShoppingListRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            parent2 = itemView.findViewById(R.id.parent2);
            fab = itemView.findViewById(R.id.fab);
            checkBox = itemView.findViewById(R.id.checkbox);

        }

    }
}



