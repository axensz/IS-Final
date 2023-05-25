package com.example.ironinsight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void regresar(View view) {
        Intent i = new Intent(this, recuperar_contrasena.class);
        startActivity(i);
    }
    public void Rutinas(View view) {
        Intent i = new Intent(this, rutinas.class);
        startActivity(i);
    }
    public void ver_progreso(View view) {
        Intent i = new Intent(this, ver_progreso.class);
        startActivity(i);
    }
    public void perfil(View view) {
        Intent i = new Intent(this, perfil.class);
        startActivity(i);
    }
}