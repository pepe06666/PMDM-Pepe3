package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView laSalida;
    Button bContador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        laSalida =findViewById(R.id.laSalida);
        bContador =findViewById(R.id.principal);

        bContador.setOnClickListener(

                for (int cont=1;cont<=10;cont++){
                   int finalCont = cont;
                   new R.Onclicklistener() {

                public void onClick(View view) {
                    laSalida.setText("Pulsando :" + String.valueOf(finalCont));
                    ;
                }

            }
            );
                }






    }
}