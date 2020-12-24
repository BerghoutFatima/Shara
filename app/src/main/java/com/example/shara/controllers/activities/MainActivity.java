package com.example.shara.controllers.activities;



import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.shara.Activity1;
import com.example.shara.models.MonObjet;
import com.example.shara.viewmodels.FragmentObject;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.example.shara.R;


import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    //FOR DESIGN
    @BindView(R.id.activity_main_bottom_navigation) BottomNavigationView bottomNavigationView;
    @BindView(R.id.creer) Button btncreate;
    ConstraintLayout layout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        this.configureAndShowMainFragment();
        layout1= (ConstraintLayout)findViewById(R.id.layout1);
        //layout1.setBackgroundColor(Color.GRAY);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return MainActivity.this.updateMainFragment(item.getItemId());

            }
        });
        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateObjet.class);
                startActivity(intent);
            }
        });


    }
    private void configureAndShowMainFragment() {
        FragmentObject f = new FragmentObject();
        FragmentTransaction FT = getFragmentManager().beginTransaction();
        FT.replace(R.id.activity_main_frame_layout, f);
        FT.commit();
    }
    private Boolean updateMainFragment(Integer integer){
        switch (integer) {
            case R.id.action_1:
                break;
            case R.id.action_2:

                break;
            case R.id.action_3:
                Intent intent1 = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(intent1);
                break;
        }
        return true;
    }
}
