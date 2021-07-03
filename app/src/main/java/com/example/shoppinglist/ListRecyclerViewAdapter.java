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

    ArrayList<ShoppingArray> shoppingLists = new ArrayList<>();
    private Context mContext;
    private RecyclerViewClickListener listener;


    public ListRecyclerViewAdapter(Context mContext, RecyclerViewClickListener listener) {
        this.mContext = mContext;
        this.listener = listener;

    }

    @NonNull
    @Override
    public ListRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout, parent, false);
        return new ListRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListRecyclerViewAdapter.ListRecyclerViewHolder holder, int position) {
        holder.txtName.setText("Shopping List");
    }

    @Override
    public int getItemCount() {
        return shoppingLists.size();
    }

    public void setShoppingLists(ArrayList<ShoppingArray> shoppingLists) {
        this.shoppingLists = shoppingLists;
        notifyDataSetChanged();
    }


    public class ListRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            listener.onClick(itemView, getAdapterPosition());
        }

        private CardView parent;
        public  TextView txtName;
        private ImageView imgView;

        public ListRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById((R.id.parent));
            txtName = itemView.findViewById(R.id.listLayoutTxt);
            imgView = itemView.findViewById(R.id.listLayoutImg);
            itemView.setOnClickListener(this);

        }

    }

    public interface RecyclerViewClickListener {
        void onClick(View v, int position);
    }

}
