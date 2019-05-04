package com.example.myapplication2.m_Ui;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.myapplication2.R;

import java.nio.file.Files;
import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmConfiguration;

import android.support.v7.widget.LinearLayoutManager;
import com.example.myapplication2.m_Realm.RealmHelper;
import com.example.myapplication2.m_Realm.Spacecraft;
import com.example.myapplication2.m_Ui.MyAdapter;

public class SecondActivity extends AppCompatActivity
{
    TextView tv;
    RecyclerView rv;
    Realm realm;
    MyAdapter adapter;
    ArrayList<String> spacecrafts;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_activity);
        tv=(TextView)findViewById(R.id.tx1);

       // tv.setText(getIntent().getStringExtra("name"));
        rv=findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));


      //  RealmConfiguration config = new RealmConfiguration.Builder().name("myapplication2.realm").schemaVersion(0).build();

        realm= Realm.getDefaultInstance();
        RealmHelper helper=new RealmHelper(realm);

        Spacecraft s=new Spacecraft();

         s.setName(getIntent().getStringExtra("name"));
        helper.saved(s);
        tv.setText(getIntent().getStringExtra("name"));


        spacecrafts = helper.retrieve();
        adapter=new MyAdapter(this,spacecrafts);
        rv.setAdapter(adapter);

    }
}
