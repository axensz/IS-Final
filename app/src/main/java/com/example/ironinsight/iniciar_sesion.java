package com.example.ironinsight;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class iniciar_sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iniciar_sesion);
    }

    public void iniciarsesion(View view) {
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }

    public void recuperarcontraseña(View view) {
        Intent i = new Intent(this, recuperar_contrasena.class);
        startActivity(i);
    }
}
