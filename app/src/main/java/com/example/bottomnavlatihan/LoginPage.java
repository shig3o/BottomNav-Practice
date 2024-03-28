package com.example.bottomnavlatihan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentTransaction;

import com.example.bottomnavlatihan.fragment.ProfileFragment;

import java.util.HashMap;

public class LoginPage extends AppCompatActivity {
    EditText username, password;
    Button login;
    HashMap<String, Account> accounts = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_page);

        username = findViewById(R.id.input1);
        password = findViewById(R.id.input2);
        login = findViewById(R.id.loginBtn);

        accounts.put("DudiSunshine", new Account("DudiSunshine","dudisunshine23@yahoo.com","password123"));
        accounts.put("RealPandaYorke", new Account("RealPandaYorke","realyorke@gmail.com","123password"));

        login.setOnClickListener(v -> {
            String enteredUsername = username.getText().toString();
            String enteredPassword = password.getText().toString();

            if (accounts.containsKey(enteredUsername)) {
                Account account = accounts.get(enteredUsername);
                if (account.getPassword().equals(enteredPassword)) {
                    Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginPage.this, MainActivity.class);
                    intent.putExtra("username", account.getUsername());
                    intent.putExtra("email", account.getEmail());
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "Invalid password.", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Account not found.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}