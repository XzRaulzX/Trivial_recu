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

public class arte extends AppCompatActivity {
    String [] preguntas={
            "¿Qué autor escribió 'El hombre invisible'?"
            ,"¿Qué autor escribió 'Oz series'?"
            ,"¿Qué autor escribió 'Manon Lescaut'?"
            ,"¿Quién escribió el libro 'El origen de las especies'?"
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
            a.setText("HG pozos");
            b.setText("neil gaiman");
            c.setText("Arturo C. Clarke");
            d.setText("C. S. Lewis");
        }else if(preguntasN==1){

            a.setText("Suzanne Collins");
            b.setText("L. Frank Baum");
            c.setText("James Fenimore Cooper");
            d.setText("doña leon");
        }else if(preguntasN==2){

            a.setText("Alfonso Daudet");
            b.setText("Emilio Zola");
            c.setText("Antoine François Prévost");
            d.setText("Alejandro Dumas");
        }else{
            a.setText("Kurt Vonnegut");
            b.setText("ernesto rutherford");
            c.setText("Tomás Hardy");
            d.setText("charles darwin");
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
                intento.putExtra("ocultar",1);
                intento.putExtra("fallo",fallos);
                intento.putExtra("dato",puntuacionTrivial+1);
                startActivityForResult(intento,0);
            }else{

                intento.putExtra("dato",puntuacionTrivial-1);
                intento.putExtra("fallo",fallos-1);
                intento.putExtra("ocultar",0);
                startActivityForResult(intento,0);
            }
        }else if(preguntasN==1){
            b.setBackgroundColor(Color.parseColor("#008000"));
            intento= new Intent(this,trivial.class);
            Handler handler = new Handler();
            handler.postDelayed(() -> {
                //TU CODIGO
            },(1000));
            if(grupo.getCheckedRadioButtonId()==b.getId()){
                Toast.makeText(this, "Correcta", Toast.LENGTH_SHORT).show();
                intento.putExtra("dato",puntuacionTrivial+1);
                intento.putExtra("fallo",fallos);
                intento.putExtra("ocultar",1);
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
                intento.putExtra("ocultar",1);
                startActivityForResult(intento,0);
            }else{

                intento.putExtra("dato",puntuacionTrivial-1);
                intento.putExtra("fallo",fallos-1);
                intento.putExtra("ocultar",0);
                startActivityForResult(intento,0);
            }
        }else{

            d.setBackgroundColor(Color.parseColor("#008000"));
            Handler handler = new Handler();
            handler.postDelayed(() -> {
                //TU CODIGO
            },(1000));
            if(grupo.getCheckedRadioButtonId()==d.getId()){
                Toast.makeText(this, "Correcta", Toast.LENGTH_SHORT).show();
                intento.putExtra("ocultar",1);
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
