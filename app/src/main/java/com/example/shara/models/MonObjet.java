package com.example.shara.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MonObjet {
    private String name;
    private String desc;
    private int degree;
    private Date date;
    private int categorie;
    private int auteur;
    private int image;

    public MonObjet() {}

    public MonObjet(String name,String desc, int image){
        this.name=name;
        this.desc=desc;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public int getDegree() {
        return degree;
    }

    public Date getDate() {
        return date;
    }

    public int getCategorie() {
        return categorie;
    }

    public String getDesc() {
        return desc;
    }

    public int getAuteur() {
        return auteur;
    }

    public int getImage() {
        return image;
    }
}