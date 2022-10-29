package com.example.funcionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

      //  Intent intent = getIntent();

        resultado = (TextView) findViewById(R.id.resultado);
         Bundle Resultado = getIntent().getExtras();
     //   resultado.setText(Resultado.getString("Primer"));
     //   resultado.setText(Resultado.getString("Segundo"));
        resultado.setText(Resultado.getString("sumar"));
    }
}