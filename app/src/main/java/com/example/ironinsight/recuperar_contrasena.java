package com.example.ironinsight;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class recuperar_contrasena extends AppCompatActivity {
    private EditText editTextContraseñaNueva, editTextContraseñaNueva2, editTextCodigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recuperar_contrasena);

        editTextContraseñaNueva = findViewById(R.id.editTextTextPassword2);
        editTextContraseñaNueva2 = findViewById(R.id.editTextTextPassword5);
        editTextCodigo = findViewById(R.id.editTextTextPassword6);
    }

    public void regresar(View view) {
        Intent i = new Intent(this, activity_main.class);
        startActivity(i);
    }

    public void actualizar(View view) {
        // Obtener los valores ingresados en los EditText
        String contraseñaNueva = editTextContraseñaNueva.getText().toString();
        String contraseñaNueva2 = editTextContraseñaNueva2.getText().toString();
        String codigo = editTextCodigo.getText().toString();
    }
}