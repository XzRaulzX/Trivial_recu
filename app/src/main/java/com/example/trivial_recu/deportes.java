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

import java.util.ArrayList;
import java.util.Random;

public class deportes extends AppCompatActivity {
    String [] preguntas={
            "¿Que equipo es conocido como 'la roja'?"
            ,"¿Cómo se llama el deporte en el que 11 contra 11 intentan meter gol en una portería?"
            ,"¿Cuándo ganó España la Eurocopa en baloncesto?"
            ,"¿Quien ganó el mundial en 2002?"
    };
    TextView pregunta;
    RadioButton a,b,c,d;
    puntuacion puntuacion= new puntuacion();
    RadioGroup grupo;
    int puntuacionTrivial,fallos;
    ArrayList<Integer> num=new ArrayList<Integer>();

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
            a.setText("España");
            b.setText("Alemania");
            c.setText("Japon");
            d.setText("Chile");
        }else if(preguntasN==1){

            a.setText("Hipice");
            b.setText("Furbo");
            c.setText("Baloncesto");
            d.setText("Fútbol");
        }else if(preguntasN==2){

            a.setText("2014");
            b.setText("2011");
            c.setText("2015");
            d.setText("2007");
        }else{
            a.setText("Alemania");
            b.setText("Brasil");
            c.setText("Italia");
            d.setText("Uruguay");
        }
    }



    public void confirmar(View view) throws InterruptedException {
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
                intento.putExtra("ocultar",2);
                intento.putExtra("fallo",fallos);
                startActivityForResult(intento,0);
            }else{

                intento.putExtra("dato",puntuacionTrivial-1);
                intento.putExtra("ocultar",0);
                intento.putExtra("fallo",fallos-1);
                startActivityForResult(intento,0);
            }
        }else if(preguntasN==1){
                d.setBackgroundColor(Color.parseColor("#008000"));
                Handler handler = new Handler();
                handler.postDelayed(() -> {
                    //TU CODIGO
                },(1000));
                if(grupo.getCheckedRadioButtonId()==d.getId()){
                    Toast.makeText(this, "Correcta", Toast.LENGTH_SHORT).show();
                    intento.putExtra("dato",puntuacionTrivial+1);
                    intento.putExtra("ocultar",2);
                    intento.putExtra("fallo",fallos);
                    startActivityForResult(intento,0);
                }else{

                    intento.putExtra("dato",puntuacionTrivial-1);
                    intento.putExtra("ocultar",0);
                    intento.putExtra("fallo",fallos-1);
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
                    intento.putExtra("ocultar",2);
                    intento.putExtra("fallo",fallos);
                    intento.putExtra("dato",puntuacionTrivial+1);
                    startActivityForResult(intento,0);
                }else{

                    intento.putExtra("dato",puntuacionTrivial-1);
                    intento.putExtra("ocultar",0);
                    intento.putExtra("fallo",fallos-1);
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
                intento.putExtra("ocultar",2);
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
