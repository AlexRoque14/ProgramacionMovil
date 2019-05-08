package com.example.calculadora.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txtValor2 = (EditText) findViewById(R.id.txtValor1);
        final EditText  txtValor = (EditText) findViewById(R.id.txtValor);
        final TextView txtResultado = (TextView) findViewById(R.id.txtResultado);


        Button btnSuma = (Button) findViewById(R.id.btnSuma);
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = String.valueOf(txtValor.getText());
                int c= Integer.parseInt(valor1);

                String valor2 = String.valueOf(txtValor2.getText());
                int b = Integer.parseInt(valor2);
                int resultado=0;

                resultado = c + b ;
                txtResultado.setText(Integer.toString(resultado));

            }
        });

        Button btnResta = (Button) findViewById(R.id.btnResta);
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 =  String.valueOf(txtValor.getText());
                int a = Integer.parseInt(valor1);
                String valor2 = String.valueOf(txtValor2.getText());
                int b = Integer.parseInt(valor2);
                int resultado=0;

                resultado = a - b;
                txtResultado.setText(Integer.toString(resultado));
            }
        });

        Button btnDividir = (Button) findViewById(R.id.btnDivision);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = String.valueOf(txtValor.getText());
                int d=Integer.parseInt(valor1);

                String valor2 = String.valueOf(txtValor2.getText());
                int n=Integer.parseInt(valor2);
                int resultado=0;

                resultado= d / n;
                txtResultado.setText(Integer.toString(resultado));
            }
        });

        Button btnMulti = (Button) findViewById(R.id.btnMulti);
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = String.valueOf(txtValor.getText());
                int a =Integer.parseInt(valor1);
                String valor2 = String.valueOf(txtValor2.getText());
                int b =Integer.parseInt(valor2);
                int resultado=0;
                resultado = a * b;

                txtResultado.setText(Integer.toString(resultado));
            }
        });

        Button btnPotencia = (Button) findViewById(R.id.btnPot);
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = String.valueOf(txtValor.getText());
                double a =Integer.parseInt(valor1);
                String valor2 = String.valueOf(txtValor2.getText());
                double b =Integer.parseInt(valor2);
                double resultado = 0;
                resultado=  Math.pow(a , b);

                txtResultado.setText(Double.toString(resultado));
            }
        });

        Button btnPorcentaje = (Button) findViewById(R.id.btnPor);
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = String.valueOf(txtValor.getText());
                int a =Integer.parseInt(valor1);
                String valor2 = String.valueOf(txtValor2.getText());
                int b =Integer.parseInt(valor2);
                int resultado = 0;
                resultado = (a * b) / 100;

                txtResultado.setText(Double.toString(resultado));
            }
        });

    }




}