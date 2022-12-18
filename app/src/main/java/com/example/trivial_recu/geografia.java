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

public class geografia extends AppCompatActivity {
    String [] preguntas={
            "¿Cual es la Capital de Eslovenia?"
            ,"¿Cual es la Capital de Croacia?"
            ,"¿Cual es la Capital de Serbia?"
            ,"¿Cual es la Capital de Albania?"
    };
    TextView pregunta;
    RadioButton a,b,c,d;
    int preguntasN,fallos;
    RadioGroup grupo;
    RadioButton[] respuestasBotonera={
            a,b,c,d
    };
    int puntuacionTrivial;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preguntas_plantilla);
        Bundle datos = this.getIntent().getExtras();
        puntuacionTrivial= datos.getInt("dato");
        fallos=datos.getInt("fallo");
        a=findViewById(R.id.respuesta1);
        b=findViewById(R.id.respuesta2);
        c=findViewById(R.id.respuesta3);
        d=findViewById(R.id.respuesta4);
        pregunta=findViewById(R.id.pregunta);
        grupo=findViewById(R.id.radioGroup);
        Random n= new Random();
        preguntasN=n.nextInt(4);
        pregunta.setText(preguntas[preguntasN]);
        if(preguntasN==0){
            a.setText("Liubliana");
            b.setText("Zagreb");
            c.setText("Máribor");
            d.setText("Ljubljanica ");
        }else if(preguntasN==1){

            a.setText("Belgrado");
            b.setText("Baku");
            c.setText("Zagreb");
            d.setText("Paris");
        }else if(preguntasN==2){

            a.setText("Belgrado");
            b.setText("Dubrovnik");
            c.setText("Vračar");
            d.setText("Voždovac");
        }else{
            a.setText("Split");
            b.setText("Tirana");
            c.setText("Madrid");
            d.setText("Kiev");
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
                intento.putExtra("ocultar",4);
                intento.putExtra("fallo",fallos);
                startActivityForResult(intento,0);
            }else{

                intento.putExtra("dato",puntuacionTrivial-1);
                intento.putExtra("ocultar",0);
                intento.putExtra("fallo",fallos-1);
                startActivityForResult(intento,0);
            }
        }else if(preguntasN==1){
            c.setBackgroundColor(Color.parseColor("#008000"));
            intento= new Intent(this,trivial.class);
            Handler handler = new Handler();
            handler.postDelayed(() -> {
                //TU CODIGO
            },(1000));
            if(grupo.getCheckedRadioButtonId()==c.getId()){
                Toast.makeText(this, "Correcta", Toast.LENGTH_SHORT).show();
                intento.putExtra("ocultar",4);
                intento.putExtra("fallo",fallos);
                intento.putExtra("dato",puntuacionTrivial+1);
                startActivityForResult(intento,0);
            }else{

                intento.putExtra("dato",puntuacionTrivial-1);
                intento.putExtra("ocultar",0);
                intento.putExtra("fallo",fallos-1);
                startActivityForResult(intento,0);
            }
        }else if(preguntasN==2){

            a.setBackgroundColor(Color.parseColor("#008000"));

            Handler handler = new Handler();
            handler.postDelayed(() -> {
                //TU CODIGO
            },(1000));
            if(grupo.getCheckedRadioButtonId()==a.getId()){
                Toast.makeText(this, "Correcta", Toast.LENGTH_SHORT).show();
                intento.putExtra("dato",puntuacionTrivial+1);
                intento.putExtra("fallo",fallos);
                intento.putExtra("ocultar",4);
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
                intento.putExtra("dato",puntuacionTrivial+1);
                intento.putExtra("fallo",fallos);
                intento.putExtra("ocultar",4);
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
