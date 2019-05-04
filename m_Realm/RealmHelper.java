package com.example.myapplication2.m_Realm;

import android.widget.Space;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.exceptions.RealmException;

public class RealmHelper {
    Realm realm;
    RealmResults<Spacecraft> spacecrafts;
    Boolean saved;
    public RealmHelper(Realm realm)
    {
        this.realm=realm;
    }
    //save
    public Boolean saved(final Spacecraft spacecraft)
    {
        if(spacecraft==null)
        {
            saved=false;
        }
        else
        {
            realm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    try {
                        Spacecraft s=realm.copyToRealm(spacecraft);
                        saved=true;
                    }catch (RealmException e)
                    {
                        e.printStackTrace();
                        saved=false;
                    }
                }
            });
        }
        return saved;
    }
    public ArrayList
    <String> retrieve()
    {
        ArrayList
                <String> spacecraftname=new ArrayList<>();
        RealmResults
                <Spacecraft> spacecrafts=realm.where(Spacecraft.class).findAll();
      for(Spacecraft s:spacecrafts)
      {
          spacecraftname.add(s.getName());
    }
return spacecraftname;
    }
}
