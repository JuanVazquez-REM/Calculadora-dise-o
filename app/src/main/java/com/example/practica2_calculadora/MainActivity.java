package com.example.practica2_calculadora;

import android.annotation.SuppressLint;
import android.sax.TextElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Variables para la calculadora
    TextView pantalla;
    double n1,n2,resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void mensaje(View view){
        Toast.makeText(this, "Ni se para que sirve, Suerte master!!", Toast.LENGTH_SHORT).show();
    }

    public void btnclick(View view){
        pantalla = (TextView) findViewById(R.id.labelpantalla);
        switch (view.getId()){
            case R.id.btncero:
                 //Pantalla lo asigno como TextView
                pantalla.setText(pantalla.getText().toString() + "0");
                break;
            case R.id.btnuno:

                pantalla.setText(pantalla.getText().toString() + "1");
                break;
            case R.id.btndos:

                pantalla.setText(pantalla.getText() + "2");
                break;
            case R.id.btntres:

                pantalla.setText(pantalla.getText() + "3");
                break;
            case R.id.btncuatro:

                pantalla.setText(pantalla.getText() + "4");
                break;
            case R.id.btncinco:

                pantalla.setText(pantalla.getText() + "5");
                break;
            case R.id.btnseis:

                pantalla.setText(pantalla.getText() + "6");
                break;
            case R.id.btnsiete:

                pantalla.setText(pantalla.getText() + "7");
                break;
            case R.id.btnocho:

                pantalla.setText(pantalla.getText() + "8");
                break;
            case R.id.btnnueve:
                pantalla = (TextView) findViewById(R.id.labelpantalla);
                pantalla.setText(pantalla.getText() + "9");
                break;
            case R.id.btncoma:

                pantalla.setText(pantalla.getText() + ",");
                break;
            case R.id.btnpunto:

                pantalla.setText(pantalla.getText() + ".");
                break;
        }


    }


    //Metodo para capturar los numeros
    public  void OnClickOperacionCapturaNumero1 (View view){
        pantalla = (TextView) findViewById(R.id.labelpantalla);
        n1 = Double.parseDouble(pantalla.getText().toString());
        pantalla.setText("");
    }

    //Metodo de suma
    public void sumar(View view){
        operador = "+";
        OnClickOperacionCapturaNumero1(view); //Retorna el operador al metodo de numero 1
    }

    public void restar(View view){
        operador = "-";
        OnClickOperacionCapturaNumero1(view);
    }

    public void multiplicar(View view){
        operador = "*";
        OnClickOperacionCapturaNumero1(view);
    }

    public void dividir(View view){
        operador = "/";
        OnClickOperacionCapturaNumero1(view);
    }

    public void porcentaje(View view){
        operador = "%";
        OnClickOperacionCapturaNumero1(view);
    }

    public void raiz(View view){
        operador = "√";
        OnClickOperacionCapturaNumero1(view);
    }


    public void btnigual(View view){
        pantalla = (TextView) findViewById(R.id.labelpantalla);
        n2 = Double.parseDouble(pantalla.getText().toString()); //Parse resibe un string depues se convierte a text despues lo convierte a string para ser editable
        switch (operador) {
            case "+":
                resultado=n1+n2;
                break;
            case "-":
                resultado=n1-n2;
                break;
            case "*":
                resultado=n1*n2;
                break;
            case "/":
                resultado=n1/n2;
                break;
            case "%":
                resultado=n1%n2;
                break;
            case "√":
                resultado=Math.sqrt(n1);
                break;
        }
        pantalla.setText(" " + resultado);
    }

    public void btnclear(View view){
        n1 = 0;
        n2 = 0;
        pantalla = (TextView) findViewById(R.id.labelpantalla);
        pantalla.setText(" ");
    }


}