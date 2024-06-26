package com.example.primera_aplicacion;

import static android.util.Log.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Llamamos los dos valores
    EditText edtVal1, edtVal2;
    //Este textView es para ver el resultado directamente no se ve si no hay un resultado
    TextView txtResult;
    //LLamammos boton calcular
    Button btnCalcular;


    public void calcularSuma(View view) {
        //Extraemos todos los valores de el xml
        EditText edtVal1 = findViewById(R.id.edtVal1);
        EditText edtVal2 = findViewById(R.id.edtVal2);

        TextView txtResult = findViewById(R.id.txtResult);

        if (edtVal1.getText().toString().isEmpty() && edtVal2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Estan vacios", Toast.LENGTH_LONG).show();
            txtResult.setText("");
        } else {
            //Convertimos los valores a double para poder usarlos tipo numerico (sirve con otros tipos)
            int value1 = Integer.parseInt(edtVal1.getText().toString());
            int value2 = Integer.parseInt(edtVal2.getText().toString());

            //Los sumamos
            int sum = value1 + value2;

            //Los mostramos en la pantalla
            txtResult.setText(String.valueOf(sum));
        }
    }

    public void Siguiente(View view) {
        Intent siguiente = new Intent(this, SegundoActivity.class);
        startActivity(siguiente);
    }

    public void irCorte2(View view) {
        Intent corte2 = new Intent(this, Corte2.class);
        startActivity(corte2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}