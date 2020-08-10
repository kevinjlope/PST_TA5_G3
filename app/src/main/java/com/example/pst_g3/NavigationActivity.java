package com.example.pst_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;

public class NavigationActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        //Inicializar el objeto tipo text view para escribir el valor sobre el los valores pasado por el Hasmap

       tv1=(TextView)findViewById(R.id.MostraPanta);

        //Creacion del Hasmap que contendra los recursos de la app

        //EL hashmap esta ordenado de la siguiente forma {Categoria,{UrlImagen,Descripcion}}

        HashMap<String, HashMap<String,String>> datos = new HashMap<String,HashMap<String, String>>();
        //HashMap<String,String>datos=new HashMap<>();

        HashMap<String,String>datosDentro= new HashMap<>();

        //Ingreso de Datos Categoria Terro
        datos.put("terror",new HashMap<String, String>());
        datos.get("terror").put("ImagenUrl","Descripcion1");

        //Dato 2 Terror

        datos.get("terror").put("ImagenUre2","Descripcionterror2");


        //Ingreso de Datos NUEVA CATEGORIA ROmance

        datos.put("Romance",new HashMap<String, String>());
        datos.get("Romance").put("https://i.pinimg.com/originals/df/13/88/df13888c426001eb701a8d6f5c617fc2.jpg","Bajo la misma estrella: es un libro escrito que  relata la historia" +
                "de una adolescente de 16 años que padece de cáncer. Es una novela de literatura juvenil y también está considerada un libro de autoayuda.");

        //Dato 2 Romance

        datos.get("Romance").put("ImagenUrl233","Descripcionromance12");

        //Ingreso de Datos NUEVA CATEGORIA Economia

        datos.put("Economia",new HashMap<String, String>());
        datos.get("Economia").put("ImagenUrl2economia","Descripcioneconomia");

        //Dato 2 Economia
        datos.get("Economia").put("ImagenUrl2economia1222","Descripcioneconomia1234");



        //Escribir dentro del text view el valor de la clave

        String dato= getIntent().getStringExtra("dato");

        tv1.setText("Hola"+ dato);
        //tv1.setText("HOLA"+ datosRomance.get("ImagenUrl233"));
        //tv1.setText("HOLA"+ datos.get("Romance").get("ImagenUrl2"));


    }



}