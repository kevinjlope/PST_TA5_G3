package com.example.pst_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

public class CategoryActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);





    }

    public void  Romance(View view){
        Intent romance = new Intent(this, NavigationActivity.class);
        //Inicializar el objeto tipo text view para escribir el valor sobre el los valores pasado por el Hasmap



        //Creacion del Hasmap que contendra los recursos de la app

        //Ingreso de Datos NUEVA CATEGORIA ROmance

        HashMap<String,String>datosRomance=new HashMap<>();

        //dato 1
        datosRomance.put("https://i.pinimg.com/originals/df/13/88/df13888c426001eb701a8d6f5c617fc2.jpg","Bajo la misma estrella: es un libro escrito que  relata la historia" +
                "de una adolescente de 16 años que padece de cáncer. Es una novela de literatura juvenil y también está considerada un libro de autoayuda.");
        //dato 2
        datosRomance.put("ImagenUrl233","Descripcionromance12");

        //Escribir dentro del text view el valor de la clave


        //tv1.setText("HOLA"+ datosRomance.values());

        romance.putExtra("dato",datosRomance.get("ImagenUrl233"));

        // Programar el envio de pelis
        startActivity(romance);



    }



    public void  Terror(View view){
        Intent terror = new Intent(this, NavigationActivity.class);

        // Programar el envio de pelis

        HashMap<String,String>datosTerror=new HashMap<>();


        //Ingreso de Datos Categoria Terror

        datosTerror.put("ImagenUrl","Descripcion1");
        datosTerror.put("ImagenUre2","Descripcionterror2");
        startActivity(terror);


    }
    public void  economia(View view){
        Intent eco = new Intent(this, NavigationActivity.class);
        HashMap<String,String>datosEconmia=new HashMap<>();


        //Ingreso de Datos Categoria Economia
        datosEconmia.put("ImagenUrl2economia","Descripcioneconomia");
        datosEconmia.put("ImagenUrl2economia1222","Descripcioneconomia1234");



        startActivity(eco);


    }
}