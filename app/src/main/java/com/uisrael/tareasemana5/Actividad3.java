package com.uisrael.tareasemana5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Actividad3 extends AppCompatActivity {
    TextView datoRecibido;
    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        datoRecibido=findViewById(R.id.tvDatoRecibido);
        datos=getIntent().getExtras();
        String datoObtenidos=datos.getString("datoEncuesta");
        datoRecibido.setText(datoObtenidos);
    }
}
