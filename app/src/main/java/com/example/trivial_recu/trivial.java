package com.example.trivial_recu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class trivial extends AppCompatActivity {
    int ganar=4;
    TextView punt;
    int puntuacionNueva;
    int fallos;
    int visible;
    int puntuacion;
    ImageView vidas;
    ImageButton deporte,corona,arte,entretenimiento,geografia;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trivial);
        //puntuacion=puntuacionFinal+puntuacionNueva;
        Bundle datos = this.getIntent().getExtras();
        puntuacionNueva= datos.getInt("dato");
        visible=datos.getInt("ocultar");
        fallos=datos.getInt("fallo");
        corona=findViewById(R.id.coronaid);
        vidas=findViewById(R.id.vidas);
        deporte=findViewById(R.id.deporte);
        arte=findViewById(R.id.arte);
        geografia=findViewById(R.id.geografia);
        entretenimiento=findViewById(R.id.entretenimiento);
        if(fallos==3){
            vidas.setImageResource(R.drawable.corazoncompleto);
        }if(fallos==2){
            vidas.setImageResource(R.drawable.corazondosvidas);
        }
        if(fallos==1){
            vidas.setImageResource(R.drawable.corazonunavidas);
        }
        if(fallos==0){
            Intent intento=new Intent(this,perder.class);
            startActivity(intento);
        }
        if(visible==1){
            arte.setVisibility(View.INVISIBLE);
        }else if(visible==2){
            deporte.setVisibility(View.INVISIBLE);
        }
        else if(visible==3){
            entretenimiento.setVisibility(View.INVISIBLE);
        }else if(visible==4){
            geografia.setVisibility(View.INVISIBLE);
        }else if(visible==5){
            corona.setImageResource(R.drawable.interrogacion);
            puntuacionNueva=0;
        }
        if(puntuacionNueva==0){

        }else if(puntuacionNueva==1){
            corona.setImageResource(R.drawable.coronauno);
        }else if(puntuacionNueva==2){
            corona.setImageResource(R.drawable.coronados);
        }else if(puntuacionNueva==3){
            corona.setImageResource(R.drawable.coronatres);
        }else if(puntuacionNueva>=4){
            corona.setImageResource(R.drawable.coronacompleta);
            Intent intento2=new Intent(this,preguntaFinal.class);
            intento2.putExtra("dato",puntuacionNueva);
            intento2.putExtra("fallo",fallos);
            startActivity(intento2);

        }else{
            corona.setImageResource(R.drawable.interrogacion);
        }

    }

    public void geografia(View view){
        Intent intento= new Intent(this,geografia.class);
        intento.putExtra("dato",puntuacionNueva);
        intento.putExtra("fallo",fallos);
        startActivity(intento);
    }

    public void deporte(View view){
        Intent intento= new Intent(this,deportes.class);
        intento.putExtra("dato",puntuacionNueva);
        intento.putExtra("fallo",fallos);
        startActivity(intento);
    }

    public void entretenimiento(View v){
        Intent intento= new Intent(this,entretenimiento.class);
        intento.putExtra("dato",puntuacionNueva);
        intento.putExtra("fallo",fallos);
        startActivity(intento);
    }


    public void arte(View v){
        Intent intento= new Intent(this,arte.class);
        intento.putExtra("dato",puntuacionNueva);
        intento.putExtra("fallo",fallos);
        startActivity(intento);
    }



}
