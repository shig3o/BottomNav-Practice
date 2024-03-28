package com.example.bottomnavlatihan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.bottomnavlatihan.databinding.ActivityMainBinding;
import com.example.bottomnavlatihan.fragment.List2dFragment;
import com.example.bottomnavlatihan.fragment.List3dFragment;
import com.example.bottomnavlatihan.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String fragmentName = getIntent().getStringExtra("fragment");
        String username = getIntent().getStringExtra("username");
        String email = getIntent().getStringExtra("email");
        Fragment fragment = null;

        Fragment ProfileFragment = new ProfileFragment();
        Bundle bundle = new Bundle();
        bundle.putString("username", username);
        bundle.putString("email", email);
        ProfileFragment.setArguments(bundle);

        if ("list3d".equals(fragmentName)) {
            fragment = new List3dFragment();
            binding.bottomNav.setSelectedItemId(R.id.list3d);
        } else {
            // Default fragment if no specific fragment is requested
            fragment = new List2dFragment();
        }

        replaceFragment(fragment);

        binding.bottomNav.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.list2d) {

                replaceFragment(new List2dFragment());

            } else if (itemId == R.id.list3d) {

                replaceFragment(new List3dFragment());

            } else if (itemId == R.id.profile) {

                replaceFragment(ProfileFragment);

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