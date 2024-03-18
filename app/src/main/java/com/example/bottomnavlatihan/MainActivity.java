package com.example.bottomnavlatihan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.bottomnavlatihan.databinding.ActivityMainBinding;
import com.example.bottomnavlatihan.fragment.List2dFragment;
import com.example.bottomnavlatihan.fragment.List3dFragment;
import com.example.bottomnavlatihan.fragment.ListProfileFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new List2dFragment());

        binding.bottomNav.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.list2d) {

                replaceFragment(new List2dFragment());

            } else if (itemId == R.id.list3d) {

                replaceFragment(new List3dFragment());

            } else if (itemId == R.id.profile) {

                replaceFragment(new ListProfileFragment());

            }

            return true;
        });
    }
    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();

    }
}