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

public class preguntaFinal extends AppCompatActivity {
    String [] preguntas={
            "En la mitología griega, ¿quiénes fueron los padres de Aquiles?"
            ,"¿Qué actriz ha aparecido en películas como Fama y Encantada?"
            ,"¿Qué líder de culto dirigió a 900 seguidores en un suicidio masivo en 1979?"
            ,"¿En qué país se encuentra la ciudad de Guayaquil?"
    };
    TextView pregunta;
    RadioButton a,b,c,d;
    int preguntasN,fallos;
    RadioGroup grupo;
    RadioButton[] respuestasBotonera={
            a,b,c,d
    };
    Intent intento2;
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
            a.setText("Peleo y Tetis");
            b.setText("Perseo y Perséfone");
            c.setText("Hera y Zeus");
            d.setText("Dédalo y Penélope ");
        }else if(preguntasN==1){

            a.setText("kate winslet");
            b.setText("Susan Sarandon");
            c.setText("Helen Mirren");
            d.setText("maggie smith");
        }else if(preguntasN==2){

            a.setText("tom taylor");
            b.setText("marcos matthews");
            c.setText("jimen jones");
            d.setText("Brian Bosworth");
        }else{
            a.setText("Brasil");
            b.setText("Colombia");
            c.setText("Chile");
            d.setText("Ecuador");
        }
    }

    public void confirmar(View view) throws InterruptedException {


        if(preguntasN==0){
            a.setBackgroundColor(Color.parseColor("#008000"));
            Handler handler = new Handler();
            handler.postDelayed(() -> {
                //TU CODIGO
            },(1000));
            if(grupo.getCheckedRadioButtonId()==a.getId()){

                intento2 = new Intent(this,ganador.class);
                startActivity(intento2);
            }else{
                intento2 = new Intent(this,trivial.class);
                intento2.putExtra("dato",puntuacionTrivial-4);
                intento2.putExtra("ocultar",0);
                intento2.putExtra("fallo",fallos-1);
                startActivityForResult(intento2,0);
            }
        }else if(preguntasN==1){
            b.setBackgroundColor(Color.parseColor("#008000"));
            Handler handler = new Handler();
            handler.postDelayed(() -> {
                //TU CODIGO
            },(1000));
            if(grupo.getCheckedRadioButtonId()==b.getId()){
                intento2 = new Intent(this,ganador.class);
                startActivity(intento2);
            }else{
                intento2 = new Intent(this,trivial.class);
                intento2.putExtra("dato",puntuacionTrivial-4);
                intento2.putExtra("ocultar",0);
                intento2.putExtra("fallo",fallos-1);
                startActivityForResult(intento2,0);
            }
        }else if(preguntasN==2){

            c.setBackgroundColor(Color.parseColor("#008000"));
            Handler handler = new Handler();
            handler.postDelayed(() -> {
                //TU CODIGO
            },(1000));
            if(grupo.getCheckedRadioButtonId()==c.getId()){
                intento2 = new Intent(this,ganador.class);
                startActivity(intento2);
            }else{
                intento2 = new Intent(this,trivial.class);
                intento2.putExtra("dato",puntuacionTrivial-4);
                intento2.putExtra("ocultar",0);
                intento2.putExtra("fallo",fallos-1);
                startActivityForResult(intento2,0);
            }
        }else{

            d.setBackgroundColor(Color.parseColor("#008000"));
            Handler handler = new Handler();
            handler.postDelayed(() -> {
                //TU CODIGO
            },(1000));
            if(grupo.getCheckedRadioButtonId()==d.getId()){
                intento2 = new Intent(this,ganador.class);
                startActivity(intento2);
            }else{
                intento2 = new Intent(this,trivial.class);
                intento2.putExtra("dato",puntuacionTrivial-4);
                intento2.putExtra("ocultar",0);
                intento2.putExtra("fallo",fallos-1);
                startActivityForResult(intento2,0);
            }
        }
    }

}
