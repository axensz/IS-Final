package com.example.ironinsight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ejercicios  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicios);
    }

    public void crearrutina(View view) {
        Intent i = new Intent(this, crear_rutina.class);
        startActivity(i);
    }
    public void regresar3(View view) {
        Intent i = new Intent(this,crear_rutina.class);
        startActivity(i);
    }
}
