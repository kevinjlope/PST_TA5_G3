package com.example.pst_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
        EditText ed1;

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

    public void  IniciarLibros(View view){
        //Intent siguienteLibros = new Intent(this, CategoryActivity.class);
        //startActivity(siguienteLibros);
        Intent vistaP = new Intent(this, PrincipalActivity.class);
        startActivity(vistaP);
        //finish();

    }


}