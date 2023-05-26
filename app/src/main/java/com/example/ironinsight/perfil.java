package com.example.ironinsight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil);
    }

    public void volver(View view) {
        Intent i = new Intent(this,home.class);
        startActivity(i);
    }

    public void cerrarsesion(View view) {
        Intent i = new Intent(this,iniciar_sesion.class);
        startActivity(i);
    }

    public void cambiarcontraseña(View view) {
        Intent i = new Intent(this,cambiar_contrasena.class);
        startActivity(i);
    }
}

