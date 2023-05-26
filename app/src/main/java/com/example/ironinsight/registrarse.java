package com.example.ironinsight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class registrarse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrarse);
    }

    public void regresar5(View view) {
        Intent i = new Intent(this,iniciar_sesion.class);
        startActivity(i);
    }

    public void registrarse(View view) {
        Intent i = new Intent(this,home.class);
        startActivity(i);
    }
}
