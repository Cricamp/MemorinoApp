package com.example.memorinoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class Nivel1Activity extends AppCompatActivity {

    ImageButton imgb00,imgb01,imgb02,imgb03,imgb04,imgb05;
    ImageButton[] parejas = new ImageButton[6];
    Button btn_salir,btn_reiniciar;
    TextView contadorPuntuacion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1);

        imgb00 = (ImageButton) findViewById(R.id.btn_00);


    }
    //Método para el botón volver
    public void Volver(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}