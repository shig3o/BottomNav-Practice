package com.example.bottomnavlatihan.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnavlatihan.KalkulatorJajargenjang;
import com.example.bottomnavlatihan.KalkulatorLingkaran;
import com.example.bottomnavlatihan.KalkulatorPersegi;
import com.example.bottomnavlatihan.KalkulatorPersegiP;
import com.example.bottomnavlatihan.KalkulatorSegitiga;
import com.example.bottomnavlatihan.KalkulatorTrapesium;
import com.example.bottomnavlatihan.MainActivity;
import com.example.bottomnavlatihan.R;


public class List2dFragment extends Fragment {
    CardView persegi, persegiPanjang, segitiga, lingkaran, jajargenjang, trapesium;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list2d, container, false);
        persegi = view.findViewById(R.id.persegi);
        persegiPanjang = view.findViewById(R.id.persegi_panjang);
        segitiga = view.findViewById(R.id.segitiga);
        lingkaran = view.findViewById(R.id.lingkaran);
        jajargenjang = view.findViewById(R.id.jajargenjang);
        trapesium = view.findViewById(R.id.trapesium);


        persegi.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KalkulatorPersegi.class);
            startActivity(intent);
        });

        persegiPanjang.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KalkulatorPersegiP.class);
            startActivity(intent);
        });

        segitiga.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KalkulatorSegitiga.class);
            startActivity(intent);
        });

        lingkaran.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KalkulatorLingkaran.class);
            startActivity(intent);
        });

        jajargenjang.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KalkulatorJajargenjang.class);
            startActivity(intent);
        });

        trapesium.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), KalkulatorTrapesium.class);
            startActivity(intent);
        });
        return view;
    }
}