package com.example.primera_aplicacion;

import static android.util.Log.*;

import androidx.appcompat.app.AppCompatActivity;

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
    Button btnCacular;

    public void calcularSuma(View view) {
        //Extraemos todos los valores de el xmla
        EditText edtVal1 = findViewById(R.id.edtVal1);
        EditText edtVal2 = findViewById(R.id.edtVal2);
        TextView txtResult = findViewById(R.id.txtResult);

        //Convertimos los valores a double para poder usarlos tipo numerico (sirve con otros tipos)
        double value1 = Double.parseDouble(edtVal1.getText().toString());
        double value2 = Double.parseDouble(edtVal2.getText().toString());

        //Los sumamos
        double sum = value1 + value2;

        //LOs mostramos en la pantalla
        txtResult.setText(String.valueOf(sum));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}