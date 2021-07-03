package com.example.shoppinglist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ListRecyclerViewAdapter extends RecyclerView.Adapter<ListRecyclerViewAdapter.ListRecyclerViewHolder> {

    private static final String TAG = "ListRecyclerView";

    ArrayList<ArrayList<String>> shoppingLists = new ArrayList<>();
    private Context mContext;

    public ListRecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ListRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_lists, parent, false);
        return new ListRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListRecyclerViewAdapter.ListRecyclerViewHolder holder, int position) {
        holder.txtName.setText("XD");
    }

    @Override
    public int getItemCount() {
        return shoppingLists.size();
    }

    public void setShoppingLists(ArrayList<ArrayList<String>> shoppingLists) {
        this.shoppingLists = shoppingLists;
        notifyDataSetChanged();
    }


    public class ListRecyclerViewHolder extends RecyclerView.ViewHolder {

        private CardView parent;
        public  TextView txtName;
        private ImageView imgView;

        public ListRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById((R.id.parent));
            txtName = itemView.findViewById(R.id.listLayoutTxt);
            imgView = itemView.findViewById(R.id.listLayoutImg);
        }
    }
}
