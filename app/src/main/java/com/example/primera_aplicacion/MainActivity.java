package com.example.primera_aplicacion;

import static android.util.Log.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Este método se llama cuando se presiona el botón
    public void enviar(View view) {
        // Muestra un Toast
        Toast.makeText(this, "Prueba", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}