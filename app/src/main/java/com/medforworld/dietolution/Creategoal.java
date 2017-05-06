package com.medforworld.dietolution;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


public class Creategoal extends Fragment {

    RelativeLayout relativeLayout;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.creategoal, container, false);

        relativeLayout = (RelativeLayout) view.findViewById(R.id.relative1);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = ((MainActivity) getContext()).getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Cre creategoal = new Creategoal();
                ft.replace(R.id.linear, creategoal);
                ft.addToBackStack(null);
                ft.commit();
            }

        });
        return view;
    }
}