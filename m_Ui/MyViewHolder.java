package com.example.myapplication2.m_Ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.example.myapplication2.R;
public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView tv;
    public MyViewHolder(View v)
    {
        super(v);
        tv=(TextView)v.findViewById(R.id.tx1);
    }
}

