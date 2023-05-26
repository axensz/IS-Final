package com.example.ironinsight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class crear_rutina extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_rutina);
    }

    public void ejercicio(View view) {
        Intent i = new Intent(this,ejercicios.class);
        startActivity(i);
    }

    public void regresar2(View view) {
        Intent i = new Intent(this,rutinas.class);
        startActivity(i);
    }

    public void rutinas(View view) {
        Intent i = new Intent(this,rutinas.class);
        startActivity(i);
    }
}
