package com.example.funcionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Button suma;
    Button resta;
    Button division;
    Button multi;
        EditText primer,segundo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        suma = (Button) findViewById(R.id.suma);
        resta = (Button) findViewById(R.id.resta);
        division = (Button) findViewById(R.id.division);
        multi = (Button) findViewById(R.id.multi);
        primer = (EditText) findViewById(R.id.primer);
        segundo = (EditText) findViewById(R.id.segundo);


        suma.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                String primerString = primer.getText().toString(),
                        segundoString = segundo.getText().toString();

                // validar que se ingrese dato
                if (primerString.equals("") || segundoString.equals("")) {
                    Toast.makeText(MainActivity.this, "Ingrese un número ", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Convertir esas String a números Int, porque no podemos sumar cadenas
               //int primer1 = Integer.parseInt(primer.getText().toString()),
               //        segundo2 = Integer.parseInt(segundo.getText().toString());
                // Hacer la suma
               int sumar= Integer.parseInt(primerString+segundoString);
           //   int resultador=sumar(Integer.valueOf(primerString.getText().toString()),
             //         (Integer.valueOf(segundoString.getText().toString());

             //   Toast.makeText(MainActivity.this, "Respuesta: ", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);

             //   intent.putExtra("Primer", primer.getText().toString());
              //  intent.putExtra("Segundo", segundo.getText().toString());
               intent.putExtra("sumar", sumar);
                //intent.putExtra("Segundo", segundo.getText().toString()
                startActivity(intent);

            }
        });

        resta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Respuesta: ", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);

                intent.putExtra("Primer", primer.getText().toString());
                intent.putExtra("Segundo", segundo.getText().toString());

                startActivity(intent);

            }
        });

        division.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Respuesta: ", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);

                intent.putExtra("Primer", primer.getText().toString());
                intent.putExtra("Segundo", segundo.getText().toString());

                startActivity(intent);

            }
        });

        multi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Respuesta: ", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);

                intent.putExtra("Primer", primer.getText().toString());
                intent.putExtra("Segundo", segundo.getText().toString());

                startActivity(intent);

            }
        });

    }
}