package com.example.myapplication2.m_Ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication2.R;
import com.example.myapplication2.m_Realm.Spacecraft;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter
<MyViewHolder>
{
 Context c;
 ArrayList
    <String> spacecrafts;
        public  MyAdapter(Context c, ArrayList
                <String> spacecrafts)
 {
     this.c=c;
     this.spacecrafts=spacecrafts;
 }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View v= LayoutInflater.from(c).inflate(R.layout.model_activity,viewGroup,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tv.setText(spacecrafts.get(i));

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
