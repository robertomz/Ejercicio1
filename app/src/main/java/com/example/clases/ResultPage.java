package com.example.clases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultPage extends AppCompatActivity {

    TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);

        lblResult = (TextView) findViewById(R.id.lblResult);

        String txtNum1 = getIntent().getStringExtra("Num1");
        String txtNum2 = getIntent().getStringExtra("Num2");
        String operacion = getIntent().getStringExtra("Operacion");

        Double resultado = 0.0;

        if (operacion.equals("suma")) {
            resultado = Double.parseDouble(txtNum1) + Double.parseDouble(txtNum2);
        }
        else if (operacion.equals("resta")) {
            resultado = Double.parseDouble(txtNum1) - Double.parseDouble(txtNum2);
        }
        else if (operacion.equals("division")) {
            resultado = Double.parseDouble(txtNum1) / Double.parseDouble(txtNum2);
        }
        else if (operacion.equals("multiplicacion")) {
            resultado = Double.parseDouble(txtNum1) * Double.parseDouble(txtNum2);
        }

        lblResult.setText(resultado.toString());
    }
}