package com.example.ironinsight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class cambiar_contrasena extends AppCompatActivity {
    private EditText editTextContraseñaActual, editTextContraseñaNueva, editTextRepetirContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextContraseñaActual = findViewById(R.id.editTextTextPassword2);
        editTextContraseñaNueva = findViewById(R.id.editTextTextPassword5);
        editTextRepetirContraseña = findViewById(R.id.editTextTextPassword6);
    }
    
}