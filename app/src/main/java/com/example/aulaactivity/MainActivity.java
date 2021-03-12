package com.example.aulaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valor1, valor2;
    private TextView resultado;
    private Button btCalcular, btLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView) findViewById(R.id.resultado);
        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);

        btCalcular = (Button) findViewById(R.id.btCalcular);
        btLimpar = (Button) findViewById(R.id.btLimpar);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular(view);
            }
        });

        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpar(view);
            }
        });

    }

    public void calcular(View view) {
        try {
            int val1 = Integer.parseInt(valor1.getText().toString());
            int val2 = Integer.parseInt(valor2.getText().toString());
            resultado.setText(String.valueOf(val1 * val2));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            resultado.setText(String.valueOf(0));
        }
    }

    public void limpar(View view) {
        valor1.setText("");
        valor2.setText("");
        resultado.setText("");
    }
}