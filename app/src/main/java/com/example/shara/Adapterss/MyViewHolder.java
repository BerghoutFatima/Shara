package com.example.shara.Adapterss;

import android.view.*;
import android.widget.*;

import androidx.recyclerview.widget.RecyclerView;

import com.example.shara.R;
import com.example.shara.models.MyObject;

public class MyViewHolder extends RecyclerView.ViewHolder{

    private TextView textViewView;
    private ImageView imageView;

    //itemView est la vue correspondante à 1 cellule
    public MyViewHolder(View itemView) {
        super(itemView);

        //c'est ici que l'on fait nos findView

        textViewView = (TextView) itemView.findViewById(R.id.text);
        imageView = (ImageView) itemView.findViewById(R.id.image);
    }
    //puis ajouter une fonction pour remplir la cellule en fonction d'un MyObject
    public void bind(MyObject myObject){
        textViewView.setText(myObject.getmNom());
        imageView.setImageResource(myObject.getmImage());
    }
}