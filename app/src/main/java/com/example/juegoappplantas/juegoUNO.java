package com.example.juegoappplantas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class juegoUNO extends AppCompatActivity {
    ImageView btnregresar2, btnregresar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_uno);

        btnregresar2 = (ImageView) findViewById(R.id.btnregresar2);

        btnregresar = (ImageView) findViewById(R.id.btnregresar);


        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(juegoUNO.this, menu.class);
                startActivity(i);
            }

        });

        btnregresar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(juegoUNO.this, menu.class);
                startActivity(i);
            }

        });

    }

}
