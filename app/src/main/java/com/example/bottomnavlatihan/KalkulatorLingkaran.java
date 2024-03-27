package com.example.bottomnavlatihan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KalkulatorLingkaran extends AppCompatActivity implements View.OnClickListener {

    Button calculate, back;
    EditText input;
    TextView info, result;
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator_lingkaran);

        calculate = findViewById(R.id.calculateButton);
        input = findViewById(R.id.input1);
        info = findViewById(R.id.info1);
        result = findViewById(R.id.result);
        back = findViewById(R.id.backButton);

        calculate.setOnClickListener(this);
        back.setOnClickListener(this);
    }
    public int getIntFromInput(EditText input) {
        if (input.getText().toString().equals("")) {
            Toast.makeText(this, "Masukkan nomor!", Toast.LENGTH_SHORT).show();
            return 0;
        } else {
            return Integer.parseInt(input.getText().toString());
        }
    }

    public void onClick(View view) {

        if (view.getId() == R.id.calculateButton) {
            num = getIntFromInput(input);
            info.setText("r = " + num +"cm");
            result.setText("L = " + calculate(num)+ "cm^2");
        } else if (view.getId() == R.id.backButton) {
            Intent intent = new Intent(KalkulatorLingkaran.this, MainActivity.class);
            startActivity(intent);
        }
    }

    private double calculate(int num) {
        if (num % 7 == 0) {
            return 22 * (num/7) * num;
        } else {
            return 3.14 * num * num;
        }
    }
}