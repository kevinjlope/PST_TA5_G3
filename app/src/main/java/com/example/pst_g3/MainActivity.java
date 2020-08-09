package com.example.pst_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView imagenLogo;
    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //imagenLogo = findViewById(R.id.imagePresentation);
        //url = "https://files.pucp.education/puntoedu/wp-content/uploads/2020/04/07144147/Catalogo-acceso-abierto-1200x800-690x468.jpghttps://files.pucp.education/puntoedu/wp-content/uploads/2020/04/07144147/Catalogo-acceso-abierto-1200x800-690x468.jpg";
        //String url2 = "https://arc-anglerfish-arc2-prod-elespectador.s3.amazonaws.com/public/PFSMQSFFU5HKZKFXCZ6ARSTDOM.jpg";
        //Picasso.with(getApplicationContext()).load(url).into(imagenLogo);


    }

}