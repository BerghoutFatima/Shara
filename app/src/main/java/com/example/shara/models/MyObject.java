package com.example.shara.models;

import java.util.ArrayList;

public class MyObject {
    private int mImage;
    private String mNom;

    public MyObject( String nom,int mImage){
        this.mImage = mImage;
        this.mNom=nom;
    }

    public String getmNom() {
        return mNom;
    }

    public int getmImage() {
        return mImage;
    }
}