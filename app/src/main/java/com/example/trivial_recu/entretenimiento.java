package com.example.trivial_recu;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class entretenimiento extends AppCompatActivity {
    String [] preguntas={
            "¿Qué actor ha aparecido en películas como Birdman y King Kong?"
            ,"¿Qué película ganó el Premio de la Academia a la Mejor Película en 1999?"
            ,"¿Cuál de estas citas es de la película 'Piratas del Caribe: La maldición de la Perla Negra'?"
            ,"¿Qué actor ha interpretado papeles en películas como Batman Forever y The Mask?"
    };
    TextView pregunta;
    RadioButton a,b,c,d;
    RadioGroup grupo;
    int puntuacionTrivial,fallos;
    RadioButton[] respuestasBotonera={
            a,b,c,d
    };
    int preguntasN;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preguntas_plantilla);
        Bundle datos = this.getIntent().getExtras();
        puntuacionTrivial= datos.getInt("dato");
        fallos=datos.getInt("fallo");
        grupo=findViewById(R.id.radioGroup);
        a=findViewById(R.id.respuesta1);
        b=findViewById(R.id.respuesta2);
        c=findViewById(R.id.respuesta3);
        d=findViewById(R.id.respuesta4);
        pregunta=findViewById(R.id.pregunta);
        Random n= new Random();
        preguntasN=n.nextInt(4);
        pregunta.setText(preguntas[preguntasN]);
        if(preguntasN==0){
            a.setText("Naomi Watts");
            b.setText("melissa leo");
            c.setText("francis conroy");
            d.setText("Chile");
        }else if(preguntasN==1){

            a.setText("Las reglas de la casa de la sidra");
            b.setText("Lo de adentro");
            c.setText("La milla verde");
            d.setText("belleza americana");
        }else if(preguntasN==2){

            a.setText("Mi precioso.");
            b.setText("¡Te atraparé a ti, mi linda, y a tu perrito también!");
            c.setText("¡Este es el día que siempre recordarás como el día en que casi atrapas al Capitán Jack Sparrow!");
            d.setText("Mantén a tus amigos cerca, pero a tus enemigos más cerca");
        }else{
            a.setText("Gerard Butler");
            b.setText("Jim Carrey");
            c.setText("hugh jackman");
            d.setText("Michael Fassbender");
        }
    }

    public void confirmar(View view) throws InterruptedException {

        System.out.println("ID GRUPO: "+grupo.getCheckedRadioButtonId()+"-----  ID: "+b.getId());
        Intent intento= new Intent(this,trivial.class);
        if(preguntasN==0){
            a.setBackgroundColor(Color.parseColor("#008000"));
            Handler handler = new Handler();
            handler.postDelayed(() -> {
                //TU CODIGO
            },(1000));
            if(grupo.getCheckedRadioButtonId()==a.getId()){
                Toast.makeText(this, "Correcta", Toast.LENGTH_SHORT).show();
                intento.putExtra("dato",puntuacionTrivial+1);
                intento.putExtra("fallo",fallos);
                intento.putExtra("ocultar",3);
                startActivityForResult(intento,0);
            }else{

                intento.putExtra("dato",puntuacionTrivial-1);
                intento.putExtra("fallo",fallos-1);
                intento.putExtra("ocultar",0);
                startActivityForResult(intento,0);
            }
        }else if(preguntasN==1){
            d.setBackgroundColor(Color.parseColor("#008000"));
            intento= new Intent(this,trivial.class);
            Handler handler = new Handler();
            handler.postDelayed(() -> {
                //TU CODIGO
            },(1000));
            if(grupo.getCheckedRadioButtonId()==d.getId()){
                Toast.makeText(this, "Correcta", Toast.LENGTH_SHORT).show();
                intento.putExtra("ocultar",3);
                intento.putExtra("fallo",fallos);
                intento.putExtra("dato",puntuacionTrivial+1);
                startActivityForResult(intento,0);
            }else{

                intento.putExtra("dato",puntuacionTrivial-1);
                intento.putExtra("fallo",fallos-1);
                intento.putExtra("ocultar",0);
                startActivityForResult(intento,0);
            }
        }else if(preguntasN==2){

            c.setBackgroundColor(Color.parseColor("#008000"));

            Handler handler = new Handler();
            handler.postDelayed(() -> {
                //TU CODIGO
            },(1000));
            if(grupo.getCheckedRadioButtonId()==c.getId()){
                Toast.makeText(this, "Correcta", Toast.LENGTH_SHORT).show();
                intento.putExtra("dato",puntuacionTrivial+1);
                intento.putExtra("fallo",fallos);
                intento.putExtra("ocultar",3);
                startActivityForResult(intento,0);
            }else{

                intento.putExtra("dato",puntuacionTrivial-1);
                intento.putExtra("fallo",fallos-1);
                intento.putExtra("ocultar",0);
                startActivityForResult(intento,0);
            }
        }else{

            b.setBackgroundColor(Color.parseColor("#008000"));
            Handler handler = new Handler();
            handler.postDelayed(() -> {
                //TU CODIGO
            },(1000));
            if(grupo.getCheckedRadioButtonId()==b.getId()){
                Toast.makeText(this, "Correcta", Toast.LENGTH_SHORT).show();
                intento.putExtra("ocultar",3);
                intento.putExtra("fallo",fallos);
                intento.putExtra("dato",puntuacionTrivial+1);
                startActivityForResult(intento,0);
            }else{

                intento.putExtra("dato",puntuacionTrivial-1);
                intento.putExtra("ocultar",0);
                intento.putExtra("fallo",fallos-1);
                startActivityForResult(intento,0);
            }
        }
    }

}
