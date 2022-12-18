package com.example.trivial_recu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Instrucciones extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.instrucciones);
    }

    public void volverA(View v){
        Intent view = new Intent(this, trivial.class);
        view.putExtra("dato",0);
        view.putExtra("ocultar",0);
        view.putExtra("fallo",3);
        startActivity(view);
    }
}
