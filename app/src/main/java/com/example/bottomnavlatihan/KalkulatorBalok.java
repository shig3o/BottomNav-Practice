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

public class KalkulatorBalok extends AppCompatActivity implements View.OnClickListener {

    Button calculate, back;
    EditText input1, input2, input3;
    TextView info1, info2, info3, result;
    int num1, num2, num3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator_balok);

        calculate = findViewById(R.id.calculateButton);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        info1 = findViewById(R.id.info1);
        info2 = findViewById(R.id.info2);
        info3 = findViewById(R.id.info3);
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
            num3 = getIntFromInput(input3);

            info1.setText("p = " + num1 +"cm");
            info2.setText("ℓ = " + num2 +"cm");
            info3.setText("t = " + num3 +"cm");
            result.setText("L = " + calculate(num1, num2, num3)+ "cm^2");
        } else if (view.getId() == R.id.backButton) {
            Intent intent = new Intent(KalkulatorBalok.this, MainActivity.class);
            intent.putExtra("fragment", "list3d");
            startActivity(intent);
        }
    }

    private int calculate(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }
}