package com.example.bottomnavlatihan.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.bottomnavlatihan.KalkulatorKubus;
import com.example.bottomnavlatihan.LoginPage;
import com.example.bottomnavlatihan.R;

public class ProfileFragment extends Fragment {
    TextView username, email;
    Button logout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);

        username = view.findViewById(R.id.name);
        email = view.findViewById(R.id.email);
        logout = view.findViewById(R.id.logoutBtn);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String usernameValue = bundle.getString("username");
            String emailValue = bundle.getString("email");

            username.setText(usernameValue);
            email.setText(emailValue);
        }

        logout.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), LoginPage.class);
            startActivity(intent);
        });

        return view;
    }
}