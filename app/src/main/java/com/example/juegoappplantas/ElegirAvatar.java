package com.example.juegoappplantas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ElegirAvatar extends AppCompatActivity {
    ImageView avatar1, avatar2, avatar3, avatar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_avatar);

        avatar1 = (ImageView) findViewById(R.id.avatar1);
        avatar2 = (ImageView) findViewById(R.id.avatar2);
        avatar3 = (ImageView) findViewById(R.id.avatar3);
        avatar4 = (ImageView) findViewById(R.id.avatar4);


        avatar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElegirAvatar.this, menu.class);
                startActivity(i);
            }

        });

        avatar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElegirAvatar.this, menu.class);
                startActivity(i);
            }

        });

        avatar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElegirAvatar.this, menu.class);
                startActivity(i);
            }

        });

        avatar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ElegirAvatar.this, menu.class);
                startActivity(i);
            }

        });




    }
}
