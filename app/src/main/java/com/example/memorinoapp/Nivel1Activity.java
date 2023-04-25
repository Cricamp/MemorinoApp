package com.example.memorinoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nivel1Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1);


    }
    //Método para el botón volver
    public void Volver(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}