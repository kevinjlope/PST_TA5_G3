package com.example.pst_g3.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.pst_g3.R;
import com.example.pst_g3.SinopsisActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CategoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CategoryFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private ImageView imagen1;
    private ImageView imagen2;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    // TODO: Rename and change types and number of parameters
    public static CategoryFragment newInstance(String param1, String param2) {
        CategoryFragment fragment = new CategoryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);

        imagen1 = (ImageView) view.findViewById(R.id.imagen2);
        imagen2 = (ImageView) view.findViewById(R.id.image);
        imagen1.setOnClickListener(new View.OnClickListener(){
            String s1 ="Viaje al centro de la tierra|Julio Verner|Universal|El profesor Lidenbrock, que une a su condición de verdadero sabio una terquedad sin límites, descifra un viejo pergamino devolviendo pacientemente su sentido a los incomprensibles signos que en él se contienen. ¡Extraordinarios peligros de la lectura! El descifrado de aquel texto arrastrará inevitablemente al propio Lidenbrok, a su joven sobrino Axel y al valeroso cazador Hans Bjelke hasta el mismísimo centro de la Tierra, poblado de animales antediluvianos, tempestades terribles y otros riesgos sin mayor importancia.";
            @Override
            public void onClick(View view) {
                mostrarSinopsis(s1);
            }
        });

        imagen2.setOnClickListener(new View.OnClickListener(){
            String s2 ="It (ESO)|Stephen King|Del Bolsillo|Varios niños de una pequeña ciudad del estado de Maine se alían para combatir a una entidad diabólica que adopta la forma de un payaso y desde hace mucho tiempo emerge cada 27 años para saciarse de sangre infantil.";
            @Override
            public void onClick(View view) {
                mostrarSinopsis(s2);
            }
        });
        return view;
    }

    public void mostrarSinopsis(String sinopsis){
        Intent intent = new Intent(getActivity().getBaseContext(),
                SinopsisActivity.class);
        intent.putExtra("codigo",sinopsis);
        getActivity().startActivity(intent);

    }


}