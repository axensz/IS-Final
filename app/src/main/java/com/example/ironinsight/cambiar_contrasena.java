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
        setContentView(R.layout.cambiar_contrasena);

        editTextContraseñaActual = findViewById(R.id.editTextTextPassword2);
        editTextContraseñaNueva = findViewById(R.id.editTextTextPassword5);
        editTextRepetirContraseña = findViewById(R.id.editTextTextPassword6);
    }

    public void regresar(View view) {
        Intent i = new Intent(this, recuperar_contrasena.class);
        startActivity(i);
    }

    public void actualizar(View view) {
        // Obtener los valores ingresados en los EditText
        String contraseñaActual = editTextContraseñaActual.getText().toString();
        String contraseñaNueva = editTextContraseñaNueva.getText().toString();
        String repetirContraseña = editTextRepetirContraseña.getText().toString();
    }
}