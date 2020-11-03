package com.example.lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("secondActivity", "onCreate called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("secondActivity", "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("secondActivity", "onPause called");
    }


    public void startSecondActivityClick(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
