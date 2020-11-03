package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button GilbertScott = findViewById(R.id.GilbertScott);
        Button SirAlwynWilliams  = findViewById(R.id.SirAlwynWilliams);
        Button BoydOrr = findViewById(R.id.BoydOrr);

        GilbertScott.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        SirAlwynWilliams.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent viewMapIntent = new Intent(Intent.ACTION_VIEW, getLocation(Building.GilbertScott       ))
            }
        });

        SirAlwynWilliams.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

    }



}
