package com.medforworld.dietolution;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;


public class Creategoal extends Fragment {
    Button btn;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.create_list_model, container, false);

        btn = (Button) view.findViewById(R.id.creategoals);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = ((MainActivity) getContext()).getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Searchgoal searchgoal = new Searchgoal();
                ft.replace(R.id.linear,searchgoal);
                ft.addToBackStack(null);
                ft.commit();
            }

        });
        return view;
    }
}
