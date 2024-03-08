package com.example.primera_aplicacion;

import static android.util.Log.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //public void enviar(View view) {
     //   Toast.makeText(this, "Prueba", Toast.LENGTH_SHORT).show();
    //}

    EditText edtVal1, edtVal2;
    Button btnCacular;

    //public float calcular(EditText edtVal1, EditText edtVal2){
     //   float resultado =

    //}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtVal1 = findViewById(R.id.edtVal1);
        edtVal2 = findViewById(R.id.edtVal2);


    }
}