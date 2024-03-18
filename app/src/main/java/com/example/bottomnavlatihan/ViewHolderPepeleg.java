package com.example.bottomnavlatihan;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class ViewHolderPepeleg extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameView, absenView;

    public ViewHolderPepeleg(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        absenView = itemView.findViewById(R.id.absen);
    }
}
