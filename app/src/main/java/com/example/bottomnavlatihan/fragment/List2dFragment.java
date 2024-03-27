package com.example.bottomnavlatihan.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnavlatihan.KalkulatorPersegi;
import com.example.bottomnavlatihan.MainActivity;
import com.example.bottomnavlatihan.R;


public class List2dFragment extends Fragment {
    CardView persegi;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list2d, container, false);
        persegi = view.findViewById(R.id.persegi);


        persegi.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KalkulatorPersegi.class);
            startActivity(intent);
        });
        return view;
    }
}