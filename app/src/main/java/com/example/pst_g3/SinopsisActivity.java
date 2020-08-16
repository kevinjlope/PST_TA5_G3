package com.example.pst_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

public class SinopsisActivity extends AppCompatActivity {
    private TextView sinopsis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinopsis2);

        DisplayMetrics medidasVentana = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidasVentana);

        int ancho= medidasVentana.widthPixels;
        int alto = medidasVentana.heightPixels;
        sinopsis=(TextView) findViewById(R.id.textView2);

        getWindow().setLayout((int) (ancho*0.85), (int) (alto*0.7));
        mostrarMensaje();
    }

    public void mostrarMensaje(){
        Intent intent = getIntent();
        String message = intent.getStringExtra("codigo");
        String[] campos = message.split("\\|");
        String titulo= campos[0];
        String autor= campos[1];
        String editorial= campos[2];
        String descripcion = campos[3];
        String mensaje = "Título: "+ titulo+"\n"+
                "Autor: "+autor+"\n"+
                "Editorial: "+editorial+"\n"+
                "Descripción: "+descripcion+"\n";
        sinopsis.setText(mensaje);
    }

    public void regresar(View view) {
        finish();
    }

}