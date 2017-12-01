package com.example.sistemas.rusia;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Lugares extends Fragment {

    private ImageButton btlajas,btver,btcum,bttu,btga,btcoc,btgua,btjua;
    private FragmentActivity myContext;
    View view;

    public Lugares() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_lugares, container, false);

        btlajas = (ImageButton) view.findViewById(R.id.lajas);
        btver = (ImageButton) view.findViewById(R.id.verde);
        btcum = (ImageButton) view.findViewById(R.id.cumbal);
        bttu = (ImageButton) view.findViewById(R.id.tumaco);
        btga = (ImageButton) view.findViewById(R.id.galeras);
        btcoc = (ImageButton) view.findViewById(R.id.coc);
        btgua = (ImageButton) view.findViewById(R.id.gua);
        btjua = (ImageButton) view.findViewById(R.id.jua);


        btlajas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",1);
                startActivity(miIntent);
            }
        });

        btver.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btcum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        bttu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btga.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btcoc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btgua.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btjua
                .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });


        return view;
    }

}
