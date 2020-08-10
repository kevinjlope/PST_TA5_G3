package com.example.pst_g3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.pst_g3.fragments.CategoryFragment;
import com.example.pst_g3.fragments.ListaFragment;
import com.example.pst_g3.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
         BottomNavigationView bottomNavi = findViewById(R.id.bottom_navigation);
        bottomNavi.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ListaFragment()).commit();
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
}