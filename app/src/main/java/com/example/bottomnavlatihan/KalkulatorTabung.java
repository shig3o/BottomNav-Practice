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

public class KalkulatorTabung extends AppCompatActivity implements View.OnClickListener {

    Button calculate, back;
    EditText input1, input2;
    TextView info1, info2, result;
    int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator_tabung);

        calculate = findViewById(R.id.calculateButton);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        info1 = findViewById(R.id.info1);
        info2 = findViewById(R.id.info2);
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
            num1 = getIntFromInput(input1);
            num2 = getIntFromInput(input2);

            info1.setText("a = " + num1 +"cm");
            info2.setText("t = " + num2 +"cm");
            result.setText("L = " + calculate(num1, num2)+ "cm^2");
        } else if (view.getId() == R.id.backButton) {
            Intent intent = new Intent(KalkulatorTabung.this, MainActivity.class);
            intent.putExtra("fragment", "list3d");
            startActivity(intent);
        }
    }

    private double calculate(int num1, int num2) {
        return Math.PI * num1 * num1 * num2;
    }
}