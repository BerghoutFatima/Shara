package com.example.shara.viewmodels;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shara.Activity1;
import com.example.shara.Adapterss.MyAdapter;
import com.example.shara.R;
import com.example.shara.controllers.activities.MainActivity;
import com.example.shara.models.MyObject;
import com.example.shara.utils.ItemClickSupport;

import java.util.ArrayList;
import java.util.List;

public class FragmentObject extends Fragment {

    private RecyclerView recyclerView;

    private List<MyObject> mesObjets = new ArrayList<>();
    View view;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_objects, container, false);

        //remplir l'bjet
        ajouterObjets();

        recyclerView = (RecyclerView) view.findViewById(R.id.RecyclerView);

        //définit l'agencement des cellules, ici de façon verticale, comme une ListView
        // recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 2));

        //pour adapter en grille comme une RecyclerView, avec 2 cellules par ligne
        //recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        //puis créer un MyAdapter, lui fournir notre liste de villes.
        //cet adapter servira à remplir notre recyclerview
        recyclerView.setAdapter(new MyAdapter(mesObjets));

        // 2 - Calling the method that configuring click on RecyclerView
        this.configureOnClickRecyclerView();

        return view;
    }
    private void configureOnClickRecyclerView(){
        ItemClickSupport.addTo(recyclerView, R.layout.item_object)
                .setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
                    @Override
                    public void onItemClicked(RecyclerView recyclerView, int position, View v) {

                        Intent intent = new Intent(view.getContext(), Activity1.class);
                        intent.putExtra("id",position);
                        startActivity(intent);
                    }
                });
    }



    private void ajouterObjets() {
        mesObjets.add(new MyObject("Un pc neuf", R.drawable.pc));
        mesObjets.add(new MyObject("Une robe bleue", R.drawable.robejaune));
        mesObjets.add(new MyObject("Un macintoch", R.drawable.mac));
        mesObjets.add(new MyObject("Allemagne", R.drawable.robe));
        mesObjets.add(new MyObject("Espagne", R.drawable.robejaune));

    }
}