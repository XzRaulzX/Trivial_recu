package com.example.trivial_recu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class portada  extends AppCompatActivity {
    EditText nombre;
    EditText contraseña;
    String usu,contra;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usu="Raul";
        contra="a";
        nombre=findViewById(R.id.editTextTextPersonName);
        contraseña=findViewById(R.id.editTextTextPassword);
    }

    public void loguear(View view) {
        if(nombre.getText().toString().equals(usu) && contraseña.getText().toString().equals(contra)){
            Toast.makeText(this, "Diviertase", Toast.LENGTH_SHORT).show();
            Intent intento= new Intent(this, Instrucciones.class);
            startActivity(intento);
        }else{
            Toast.makeText(this, "Usuario o contraseña incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
    public void acercade(View view){
        Intent intento= new Intent(this, acercade.class);
        startActivity(intento);
    }


}
