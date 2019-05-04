package com.example.myapplication2.m_Realm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Spacecraft extends RealmObject {
    @PrimaryKey
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
