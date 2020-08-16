package com.example.pst_g3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NewAccountActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);


    }

    public void regresar(View view) {
        finish();
    }

    public void crearCuenta(View view){
        EditText nombre = (EditText) findViewById(R.id.etNombre);
        EditText apellidos = (EditText) findViewById(R.id.etNombre);
        EditText usuario = (EditText) findViewById(R.id.etUsuario);
        EditText correo = (EditText) findViewById(R.id.etCorreo);
        EditText celular = (EditText) findViewById(R.id.etCelular);
        EditText genero = (EditText) findViewById(R.id.etGenero);

        String[] info={nombre.getText().toString(),
                apellidos.getText().toString(),
                correo.getText().toString(),
                celular.getText().toString(),
                genero.getText().toString()};
        PrincipalActivity.usuarios.put(usuario.getText().toString(), info);

        Toast toast = Toast.makeText(getApplicationContext(),"Se ha creado su cuenta!",Toast.LENGTH_LONG);
        toast.show();
        finish();


    }

}