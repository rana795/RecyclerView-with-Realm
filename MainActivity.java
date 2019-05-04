package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication2.m_Realm.RealmHelper;
import com.example.myapplication2.m_Realm.Spacecraft;
import com.example.myapplication2.m_Ui.MyAdapter;
import com.example.myapplication2.m_Ui.SecondActivity;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    Button b1;
Realm realm;
    Intent ii;
   // RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.ed1);
        b1=(Button)findViewById(R.id.b1);
        /*
       rv=findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        realm=Realm.getDefaultInstance();
        RealmHelper helper=new RealmHelper(realm);
        helper.retrievefromdb();
       adapter=new MyAdapter(this,helper.justRefresh());
        rv.setAdapter(adapter);
*/
    }
    public void saved(View v)
    {



        String name=ed1.getText().toString();



        ii=new Intent(this, SecondActivity.class);
           ii.putExtra("name",name);


        if(name!=null && name.length()>0){
            startActivity(ii);

        }
        else
        {
            Toast.makeText(MainActivity.this,"Name cannt be empty",Toast.LENGTH_SHORT).show();
        }

    }

}
