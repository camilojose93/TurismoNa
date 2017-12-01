package com.example.sistemas.rusia;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Principal extends Fragment {

    public Principal() {
        // Required empty public constructor
    }

    private FragmentActivity myContext;
    View view;
    ImageButton bmap1;

    @Override
    public void onAttach(Activity activity) {
        myContext = (FragmentActivity) activity;
        super.onAttach(activity);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_principal, container, false);



        bmap1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",13);
                startActivity(miIntent);
            }
        });

        return view;

    }

}
