package com.example.ironinsight;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class medidas_corporales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medidas_corporales);
    }

    public void home(View view) {
        Intent i = new Intent(this,home.class);
        startActivity(i);
    }

    public void regresar4(View view) {
        Intent i = new Intent(this,ver_progreso.class);
        startActivity(i);
    }

}


