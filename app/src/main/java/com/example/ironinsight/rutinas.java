package com.example.ironinsight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class rutinas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consultar_rutina);
    }

    public void regresar6(View view) {
        Intent i = new Intent(this,home.class);
        startActivity(i);
    }

    public void crearrutina(View view) {
        Intent i = new Intent(this,iniciar_sesion.class);
        startActivity(i);
    }

}
