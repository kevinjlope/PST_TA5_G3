package com.example.pst_g3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;

import com.example.pst_g3.fragments.CategoryFragment;
import com.example.pst_g3.fragments.ListaFragment;
import com.example.pst_g3.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.HashMap;

public class PrincipalActivity extends AppCompatActivity {
    public static String idUsuario;
    public static HashMap<String, String[]> usuarios = new HashMap<String, String[]>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        iniciarDatos();
        //Intent intent = getIntent();
        //idUsuario = intent.getStringExtra("usuario");
        System.out.println("usuario PrincipalActivity: "+idUsuario);

         BottomNavigationView bottomNavi = findViewById(R.id.bottom_navigation);
        bottomNavi.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ListaFragment()).commit();




    }

    public static void setUser(String usuario){
        idUsuario=usuario;
    }
    public static String getUser(){
        return idUsuario;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selecFragment = null;
            switch (item.getItemId()){
                case R.id.nav_list:
                    selecFragment = new ListaFragment();
                    break;
                case R.id.nav_category:
                    selecFragment = new CategoryFragment();
                    break;
                case R.id.nav_profile:
                    selecFragment = new ProfileFragment();
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selecFragment).commit();
            return true;
        }
    };

    public void iniciarDatos(){
        String[] datos = {"Héctor", "Triviño González","alexander200036@hotmail.com", "0912345678","Terror"};
        usuarios.put("htrivino",datos);
        String[] datos2 = {"Carlos", "Piguave Villamar","cpv1999@hotmail.com", "0912345675","Romántico"};
        usuarios.put("cpv1999",datos2);


        //ProfileFragment.setInfoUser(idUsuario,usuarios.get(idUsuario));
        // El de arriba es el que debe ir, pongo el de abajo para que no tengan que ubicar el nombre del usuario en login
        // Porque si no ponen el usuario se les cae el programa
        ProfileFragment.setInfoUser("htrivino",usuarios.get("htrivino"));

    }



}