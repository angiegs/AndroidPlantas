package com.example.juegoappplantas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class menu extends AppCompatActivity {
    ImageView btnj1, btnrep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnj1 = (ImageView) findViewById(R.id.btn1);

        btnrep = (ImageView) findViewById(R.id.btnregresar);






     btnj1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent j = new Intent( menu.this, juegoUNO.class);
             startActivity(j);

         }


      });



        btnrep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menu.this, MainActivity.class);
                startActivity(i);
            }

        });


    }
}
