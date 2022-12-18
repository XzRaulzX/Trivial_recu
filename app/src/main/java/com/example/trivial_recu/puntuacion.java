package com.example.trivial_recu;

public class puntuacion{
    int puntuacion;
    public puntuacion(){
        puntuacion=0;
    }

    public int getPuntuacion(){
        return puntuacion;
    }

    public void setPuntuacion(int p){
        puntuacion=p;
        System.out.println("Esta es la puntuacion actual: "+puntuacion);
    }

}
