package com.example.memorinoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText etNombre;
    ImageView img_Portada;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombre = (EditText) findViewById(R.id.etNombre);
        img_Portada = (ImageView) findViewById(R.id.ivPortada);

        //creamos una variable con un numero aleatorio para que la imagen de la portada sea aleatoria.
        int numeroAleatorio = (int) (Math.random() * 4);

        switch (numeroAleatorio) {
            case 0:
                img_Portada.setImageResource(R.drawable.portada00);
            case 1:
                img_Portada.setImageResource(R.drawable.portada01);
            case 2:
                img_Portada.setImageResource(R.drawable.portada02);
            case 3:
                img_Portada.setImageResource(R.drawable.portada03);
        }
    }

    //método para mostrar y ocultar el menú overflow, método booleano solo va a ser true o false
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }
    //método para el botón registrar
    public void Registrar (View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "listado", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();

        String jugadores = etNombre.getText().toString();

        if (!jugadores.isEmpty()){
            ContentValues registro = new ContentValues();

            registro.put("jugador", jugadores);

            BaseDeDatos.insert("jugadores", null, registro);

            //Cerramos la base de datos
            BaseDeDatos.close();

            etNombre.setText("");
            Toast.makeText(this, "El jugador se ha grabado correctamente", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Debes rellenar el campo nombre", Toast.LENGTH_SHORT).show();
        }1000,
    }


    //método para el botón jugar
    public void Play(View view){
        Intent play = new Intent(this, Nivel1Activity.class );
        startActivity(play);
    }

}

