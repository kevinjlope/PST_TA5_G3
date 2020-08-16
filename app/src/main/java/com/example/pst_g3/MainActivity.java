package com.example.pst_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.pst_g3.fragments.ListaFragment;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
        EditText ed1;
        private ImageView imv_photo;
        private String photo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarImagen();

    }

    //for(int i=0; i<nombr.size(); i++){
        //Item item = new Item(NOMBR[I][0], NOMBR[I][1],....);

   // }
    public void iniciarImagen(){
        photo = "https://img.pngio.com/ebook-png-94-images-in-collection-page-1-ebook-png-300_318.png";
        imv_photo = findViewById(R.id.imageMain);
        Picasso.with(getApplicationContext()).load(photo).into(imv_photo);

        Intent i = new Intent(this, LoginActivity.class);
        sleepImage h1 = new sleepImage(i);
        h1.start();
    }

    class sleepImage extends Thread{
        Intent i;
        public sleepImage(Intent i){
            this.i = i;
        }
        public void run() {
            try {
                Thread.sleep(3000);
                startActivity(i);
                finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}