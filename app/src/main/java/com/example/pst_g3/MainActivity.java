package com.example.pst_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setTheme(R.style.AppTheme); //indicarle a nuestro main activity va a tener un nuevo tema
        //que es encargado de mostra el splashscreen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}