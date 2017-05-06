package com.medforworld.dietolution;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Searchadapter extends RecyclerView.Adapter<Searchadapter.MyViewHolder> {

    Context context;
    public Searchadapter(Context context){
        this.context = context;

    }

    @Override
    public Searchadapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.create_list_model , parent);
        return new Searchadapter.MyViewHolder(view);




    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

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


