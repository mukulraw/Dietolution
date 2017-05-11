package com.medforworld.dietolution;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class DietAdapter extends RecyclerView.Adapter<DietAdapter.MyViewHolder> {

    Context context;

    public  DietAdapter (Context context){
        this.context = context;
    }


    @Override
    public DietAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(DietAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{


        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}

