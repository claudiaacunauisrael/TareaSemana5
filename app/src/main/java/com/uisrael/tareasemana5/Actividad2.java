package com.uisrael.tareasemana5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {
    TextView recibo;
    Bundle datos;
    RadioButton rb1,rb2,rb3,rb4,rb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        rb4=findViewById(R.id.rb4);
        rb5=findViewById(R.id.rb5);

        recibo=findViewById(R.id.tvRecibo);
        datos=getIntent().getExtras();
        String datosObtenidos=datos.getString("datoEnvio");
        recibo.setText(datosObtenidos);
    }

    public void MostrarRb (View v){
        if (rb1.isChecked()){
            Intent abrir_ventana3=new Intent(Actividad2.this,Actividad3.class);
            abrir_ventana3.putExtra("datoEncuesta",rb1.getText().toString());
            Toast.makeText(getApplicationContext(),rb1.getText(),Toast.LENGTH_LONG).show();
            startActivity(abrir_ventana3);
        }

        if (rb2.isChecked()){
            Intent abrir_ventana3=new Intent(Actividad2.this,Actividad3.class);
            abrir_ventana3.putExtra("datoEncuesta",rb2.getText().toString());
            Toast.makeText(getApplicationContext(),rb2.getText(),Toast.LENGTH_LONG).show();
            startActivity(abrir_ventana3);
        }

        if (rb3.isChecked()){
            Intent abrir_ventana3=new Intent(Actividad2.this,Actividad3.class);
            abrir_ventana3.putExtra("datoEncuesta",rb3.getText().toString());
            Toast.makeText(getApplicationContext(),rb3.getText(),Toast.LENGTH_LONG).show();
            startActivity(abrir_ventana3);
        }

        if (rb4.isChecked()){
            Intent abrir_ventana3=new Intent(Actividad2.this,Actividad3.class);
            abrir_ventana3.putExtra("datoEncuesta",rb4.getText().toString());
            Toast.makeText(getApplicationContext(),rb4.getText(),Toast.LENGTH_LONG).show();
            startActivity(abrir_ventana3);
        }

        if (rb5.isChecked()){
            Intent abrir_ventana3=new Intent(Actividad2.this,Actividad3.class);
            abrir_ventana3.putExtra("datoEncuesta",rb5.getText().toString());
            Toast.makeText(getApplicationContext(),rb5.getText(),Toast.LENGTH_LONG).show();
            startActivity(abrir_ventana3);
        }
    }
}
