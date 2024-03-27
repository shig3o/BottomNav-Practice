package com.example.bottomnavlatihan.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnavlatihan.KalkulatorKubus;
import com.example.bottomnavlatihan.KalkulatorPersegi;
import com.example.bottomnavlatihan.R;


public class List3dFragment extends Fragment {

    CardView kubus, balok, kerucut, bola, tabung;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list3d, container, false);

        kubus = view.findViewById(R.id.kubus);
        balok = view.findViewById(R.id.balok);
        kerucut = view.findViewById(R.id.kerucut);
        bola = view.findViewById(R.id.bola);
        tabung = view.findViewById(R.id.tabung);

        kubus.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KalkulatorKubus.class);
            startActivity(intent);
        });

        return view;
    }
}