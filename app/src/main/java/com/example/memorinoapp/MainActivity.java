package com.example.memorinoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //método para mostrar y ocultar el menú overflow, método booleano solo va a ser true o false
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    //método para el botón jugar
    public void Play(View view){
        Intent play = new Intent(this, Nivel1Activity.class );
        startActivity(play);
    }

}