package com.example.bottomnavlatihan.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomnavlatihan.AdapterSiswa10PPLG1;
import com.example.bottomnavlatihan.ItemPepeleg;
import com.example.bottomnavlatihan.R;

import java.util.ArrayList;
import java.util.List;

public class ListProfileFragment extends Fragment {
    private RecyclerView recyclerView;
    private AdapterSiswa10PPLG1 adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_profile, container, false);
        recyclerView = view.findViewById(R.id.RVListPepeleg);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        List<ItemPepeleg> items = new ArrayList<ItemPepeleg>();

        String[] siswa = {
                "Abdun Nafi Hibatullah",
                "Aldiansyah Fayruz",
                "Alikha Mutiara Hati",
                "Allam Permata Putra",
                "Arbani Akhyar Radjadin",
                "Arsya Fauz Marzuki",
                "Azzam Fitrawansyah Salim",
                "Azzan Isham Alawiy",
                "Burhanuddin Zain",
                "Daffa Raziq Angie Irawan",
                "Dylan Athallah Alam",
                "Dzaky Ihsan Rasyid",
                "Hilal Syah Amali",
                "Jeremy Edward Domenico Sanjaya",
                "Jovanco Nicholas Rise",
                "Khalisha Kaylanasywa",
                "Maulana Arka Narendra",
                "Muhammad Asraf El Farras",
                "Muhammad Choirul'Anam",
                "Muhammad Evan Maxsalmina",
                "Muhammad Fakhry Alifahrizq A.",
                "Muhammad Rafif Azka Budiawan",
                "Muhammad Zuhrizal",
                "Nafisah Isbarsani",
                "Nail Zhavier Adhyaksa",
                "Nasharuddin Hatta",
                "Naufal Afdhal Haryda",
                "Nicholas Christian Chandra",
                "Ocean Karuna Muryanto",
                "Pajri Al Fikri Riandi",
                "Radithia Arlistian Saputra",
                "Rifqi Wibisono Himmawan",
                "Royyan Ahmad Zaydan",
                "Ruga Zinedine Airinka",
                "Satria Rudi Pratama",
                "Shofiyyul Hilmi",
                "Zaskia Amelia Putri"
        };


        for (int i = 0; i < siswa.length; i++){
            items.add(new ItemPepeleg(siswa[i],Integer.toString(i + 1),"https://media.tenor.com/akFQ4BiD1UEAAAAe/radiohead-thom-yorke.png"));
        }

        adapter = new AdapterSiswa10PPLG1(getActivity(), items);
        recyclerView.setAdapter(adapter);

        return view;
    }
}