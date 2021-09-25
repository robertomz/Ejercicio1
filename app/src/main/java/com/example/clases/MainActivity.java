package com.example.clases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtNum1, txtNum2;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);

        Button btnSuma = (Button) findViewById(R.id.btnSuma);
        Button btnResta = (Button) findViewById(R.id.btnResta);
        Button btnDivi = (Button) findViewById(R.id.btnDivi);
        Button btnMulti = (Button) findViewById(R.id.btnMulti);

        btnSuma.setOnClickListener(view -> {
            operacion = "suma";
            Intent intent = new Intent(getApplicationContext(), ResultPage.class);

            intent.putExtra("Num1", txtNum1.getText().toString());
            intent.putExtra("Num2", txtNum2.getText().toString());
            intent.putExtra("Operacion", operacion);

            startActivity(intent);
        });

        btnResta.setOnClickListener(view -> {
            operacion = "resta";
            Intent intent = new Intent(getApplicationContext(), ResultPage.class);

            intent.putExtra("Num1", txtNum1.getText().toString());
            intent.putExtra("Num2", txtNum2.getText().toString());
            intent.putExtra("Operacion", operacion);

            startActivity(intent);
        });

        btnDivi.setOnClickListener(view -> {
            operacion = "division";
            Intent intent = new Intent(getApplicationContext(), ResultPage.class);

            intent.putExtra("Num1", txtNum1.getText().toString());
            intent.putExtra("Num2", txtNum2.getText().toString());
            intent.putExtra("Operacion", operacion);

            startActivity(intent);
        });

        btnMulti.setOnClickListener(view -> {
            operacion = "multiplicacion";
            Intent intent = new Intent(getApplicationContext(), ResultPage.class);

            intent.putExtra("Num1", txtNum1.getText().toString());
            intent.putExtra("Num2", txtNum2.getText().toString());
            intent.putExtra("Operacion", operacion);

            startActivity(intent);
        });
    }
}