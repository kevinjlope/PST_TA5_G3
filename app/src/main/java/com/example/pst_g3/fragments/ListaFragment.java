package com.example.pst_g3.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.pst_g3.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Button boton;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Item item;
    // se crean las peliculas para mostar
    private ArrayList<String> tabla1,tabla2,tabla3,tabla4,tabla5,tabla6,tabla7;



    public ListaFragment() {
        //

    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListaFragment newInstance(String param1, String param2) {
        ListaFragment fragment = new ListaFragment();
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

    public void sinopsis (View view){
        Item tabla1=new Item("@drawable/viaje","Viaje al centro de la tierra","Julio Verner","Universal","El profesor Lidenbrock, que une a su condición de verdadero sabio una terquedad sin límites, descifra un viejo pergamino devolviendo pacientemente su sentido a los incomprensibles signos que en él se contienen. ¡Extraordinarios peligros de la lectura! El descifrado de aquel texto arrastrará inevitablemente al propio Lidenbrok, a su joven sobrino Axel y al valeroso cazador Hans Bjelke hasta el mismísimo centro de la Tierra, poblado de animales antediluvianos, tempestades terribles y otros riesgos sin mayor importancia.");
        Item tabla2=new Item("@drawable/it","It (ESO)","Stephen King","DelBolsillo","Varios niños de una pequeña ciudad del estado de Maine se alían para combatir a una entidad diabólica que adopta la forma de un payaso y desde hace mucho tiempo emerge cada 27 años para saciarse de sangre infantil.");
        /*ArrayList<String> tabla3=generartabla("@drawable/principito","El principito","Saint-Exupery","Biblioteca ILCE","Un aviador queda incomunicado en el desierto tras sufrir una avería en su avión a mil millas de cualquier región habitada. Allí se encontrará con un pequeño príncipe de cabellos de oro que afirma vivir en el asteroide B 612 (donde hay una rosa y tres volcanes) con el que no tardará en congeniar. En sus conversaciones, el principito le relatará su visión sobre la vida y la gente, de esa sabiduría que se pierde cuando las personas abandonamos la infancia.");
        ArrayList<String> tabla4=generartabla("@drawable/dracula","Dracula","Bram Stoker","Desconocido","El conde Drácula viaja a Londres en busca de la mujer a la que siempre amó. El profesor Van Helsing y un grupo de valientes tratará de detener al maligno vampiro, antes de que su sed de sangre devaste la metrópoli inglesa.");
        ArrayList<String> tabla5=generartabla("@drawable/estrella","Bajo la misma estrella","John Green","Nubedetinta","Dos adolescentes pacientes de cáncer inician un viaje para reafirmar sus vidas y visitar a un escritor solitario en Ámsterdam.");
        ArrayList<String> tabla6=generartabla("@drawable/amor","Amor a primera vista","P.Z. Reaizin","Planeta","Un cantante, ídolo popular, se casa por poder y confusión con una joven sin conocerla, pero ella sí lo conoce y lo ama.");
        ArrayList<String> tabla7=generartabla("@drawable/fisica","Fisica Universitaria","Sear Zemansky","Freedman","Libro para estudiantes de universidad con conocimiento avanzados en fisica");
        // Required empty public constructor*/
        System.out.println(tabla2.getSinopsis());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        boton = (Button) view.findViewById(R.id.boton1);
        boton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                sinopsis(view);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}