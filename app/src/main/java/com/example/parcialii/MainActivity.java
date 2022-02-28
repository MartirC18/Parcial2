package com.example.parcialii;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
private ImageButton uno;
    private ImageButton dos;
    private ImageButton tres;
    private ImageButton cuatro;
    private ImageButton cinco;
    private ImageButton seis;
    private ImageButton siete;
    private ImageButton ocho;
    private ImageButton nueve;
    private ImageButton diez;

    MediaPlayer sonidouno;
    MediaPlayer sonidodos;
    MediaPlayer sonidotres;
    MediaPlayer sonidocuatro;
    MediaPlayer sonidocinco;
    MediaPlayer sonidoseis;
    MediaPlayer sonidosiete;
    MediaPlayer sonidoocho;
    MediaPlayer sonidonueve;
    MediaPlayer sonidodiez;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno=(ImageButton)findViewById(R.id.btn1);
        dos=(ImageButton)findViewById(R.id.btn2);
        tres=(ImageButton)findViewById(R.id.btn3);
        cuatro=(ImageButton)findViewById(R.id.btn4);
        cinco=(ImageButton)findViewById(R.id.btn5);
        seis=(ImageButton)findViewById(R.id.btn6);
        siete=(ImageButton)findViewById(R.id.btn7);
        ocho=(ImageButton)findViewById(R.id.btn8);
        nueve=(ImageButton)findViewById(R.id.btn9);
        diez=(ImageButton)findViewById(R.id.btn10);

        sonidouno=MediaPlayer.create(getApplicationContext(),R.raw.unoo);
        sonidodos=MediaPlayer.create(getApplicationContext(),R.raw.doss);
        sonidotres=MediaPlayer.create(getApplicationContext(),R.raw.tress);
        sonidocuatro=MediaPlayer.create(getApplicationContext(),R.raw.cuatroo);
        sonidocinco=MediaPlayer.create(getApplicationContext(),R.raw.cincoo);
        sonidoseis=MediaPlayer.create(getApplicationContext(),R.raw.seiss);
        sonidosiete=MediaPlayer.create(getApplicationContext(),R.raw.sietee);
        sonidoocho=MediaPlayer.create(getApplicationContext(),R.raw.ochoo);
        sonidonueve=MediaPlayer.create(getApplicationContext(),R.raw.nuevee);
        sonidodiez=MediaPlayer.create(getApplicationContext(),R.raw.diez);

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              sonidouno.start();
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidodos.start();
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidotres.start();
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidocuatro.start();
            }
        });
         cinco.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 sonidocinco.start();
             }
         });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidoseis.start();
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidosiete.start();
            }
        });
       ocho.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               sonidoocho.start();
           }
       });
       nueve.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               sonidonueve.start();
           }
       });

       diez.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               sonidodiez.start();
           }
       });








    }
}