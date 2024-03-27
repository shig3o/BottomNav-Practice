package com.example.bottomnavlatihan.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnavlatihan.KalkulatorBalok;
import com.example.bottomnavlatihan.KalkulatorBola;
import com.example.bottomnavlatihan.KalkulatorKerucut;
import com.example.bottomnavlatihan.KalkulatorKubus;
import com.example.bottomnavlatihan.KalkulatorTabung;
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

        balok.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KalkulatorBalok.class);
            startActivity(intent);
        });

        kerucut.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KalkulatorKerucut.class);
            startActivity(intent);
        });

        bola.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KalkulatorBola.class);
            startActivity(intent);
        });

        tabung.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KalkulatorTabung.class);
            startActivity(intent);
        });

        return view;
    }
}