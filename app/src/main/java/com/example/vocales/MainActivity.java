package com.example.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    MediaPlayer mp2;
    ImageButton btnA;
    ImageButton btnB;
    MediaPlayer mp3;
    ImageButton btnC;
    MediaPlayer mp4;
    ImageButton btnD;
    MediaPlayer mp5;
    ImageButton btnE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnA = (ImageButton) findViewById(R.id.btnA);
        btnB = (ImageButton) findViewById(R.id.btnB);
        btnC = (ImageButton) findViewById(R.id.btnC);
        btnD = (ImageButton) findViewById(R.id.btnD);
        btnE = (ImageButton) findViewById(R.id.btnE);


        mp = MediaPlayer.create(this, R.raw.clic);
        mp2 = MediaPlayer.create(this, R.raw.b);
        mp3 = MediaPlayer.create(this, R.raw.c);
        mp4 = MediaPlayer.create(this, R.raw.d);
        mp5 = MediaPlayer.create(this, R.raw.e);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();

            }

        });


        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();

            }

        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();

            }

        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.start();

            }

        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp5.start();

            }

        });
      }





}
