package com.example.sumadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //Paso 1: Declaramos las variables que enlazaremos con los controladores de la vista
    EditText etNum1, etNum2;
    Button btnCalcula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Paso 2: Enlazo los controladores de la vista mediante R
        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
    }

    public void Sumar(View view1){
        String num1 =etNum1.getText().toString();
        String num2 =etNum2.getText().toString();

        if(num1.equals("") || num2.equals("")){
            Toast.makeText(getApplicationContext(), "ERROR: Debes llenar ambos campos", Toast.LENGTH_LONG).show();
        }else{
            double res = Double.parseDouble(num1) + Double.parseDouble(num2);
            Toast.makeText(getApplicationContext(), "El resultado es:" + res, Toast.LENGTH_LONG).show();
        }
    }
}