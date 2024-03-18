package com.example.bottomnavlatihan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterSiswa10PPLG1 extends RecyclerView.Adapter<AdapterSiswa10PPLG1.ViewHolderPepeleg> {

    Context context;
    List<ItemPepeleg> items;
    private ItemClickListener mClickListener;

    public AdapterSiswa10PPLG1(Context context, List<ItemPepeleg> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolderPepeleg onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new ViewHolderPepeleg(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPepeleg holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.absenView.setText(items.get(position).getAbsen());

        Glide.with(context)
                .load(items.get(position).getImage())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    // ViewHolder class
    public class ViewHolderPepeleg extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView nameView;
        TextView absenView;
        ImageView imageView;

        ViewHolderPepeleg(View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.name);
            absenView = itemView.findViewById(R.id.absen);
            imageView = itemView.findViewById(R.id.imageview);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    String getItem(int id) {
        return items.get(id).getName();
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
