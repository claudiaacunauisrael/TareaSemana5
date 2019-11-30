package com.uisrael.tareasemana5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUsuario,etContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsuario=findViewById(R.id.etUsuario);
        etContraseña=findViewById(R.id.etContraseña);
    }

    public void loguin(View v){
        String user=etUsuario.getText().toString();
        String pass=etContraseña.getText().toString();
        if (user.equals("claudia")&& pass.equals("est.uisrael.2019")){
            Intent abrir_ventana=new Intent(MainActivity.this, Actividad2.class);
            abrir_ventana.putExtra("datoEnvio",user);
            Toast.makeText(getApplicationContext(),"Ingreso correcto: "+user,Toast.LENGTH_LONG).show();
            startActivity(abrir_ventana);
        }

    }
}
