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

        //Ingreso de Datos 1
        datos.put("terror",new HashMap<String, String>());
        datos.get("terror").put("ImagenUrl","Descripcion");

        //Ingreso de Datos NUEVA CATEGORIA
        datos.put("terror",new HashMap<String, String>());
        datos.get("terror").put("ImagenUrl","Descripcion");


        //Escribir dentro del text view el valor de la clave


        tv1.setText("HOLA"+ datos.get("terror").get("ImagenUrl"));


    }



}