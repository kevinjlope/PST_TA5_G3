package com.example.pst_g3.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pst_g3.PrincipalActivity;
import com.example.pst_g3.R;

import org.w3c.dom.Text;

import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    private static String nombreUsuario;
    private static String[] info;

    private static TextView usuario;
    private static TextView nombres;
    private static TextView apellidos;
    private static TextView correo;
    private static TextView celular;
    private static TextView favorito;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("HOla");
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container,false);

        usuario = (TextView) view.findViewById(R.id.textView3);
        nombres = (TextView) view.findViewById(R.id.textView6);
        apellidos = (TextView) view.findViewById(R.id.textView7);
        correo = (TextView) view.findViewById(R.id.textView8);
        celular = (TextView) view.findViewById(R.id.textView9);
        favorito = (TextView) view.findViewById(R.id.textView10);

        usuario.setText(nombreUsuario);
        nombres.setText("Nombres: "+info[0]);
        apellidos.setText("Apellidos: "+info[1]);
        correo.setText("Correo: "+ info[2]);
        celular.setText("Celular: "+info[3]);
        favorito.setText("Favorito: "+info[4]);

        return view;

    }

    public static void setInfoUser(String nombre, String[] infor){
        nombreUsuario=nombre;
        info=infor;
    }
}