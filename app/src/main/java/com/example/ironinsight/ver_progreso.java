package com.example.ironinsight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ver_progreso extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ver_progreso);
    }

    public void regresar7(View view) {
        Intent i = new Intent(this,home.class);
        startActivity(i);
    }

    public void ingresarmeco(View view) {
        Intent i = new Intent(this, medidas_corporales.class);
        startActivity(i);
    }
}
