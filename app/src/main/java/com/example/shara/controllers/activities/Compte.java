package com.example.shara.controllers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shara.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Compte  extends AppCompatActivity {
    @BindView(R.id.textView)
    TextView nom;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compte_activity);
        ButterKnife.bind(this);
        Intent intent = getIntent();
       String name = intent.getExtras().getString("id");
       nom.setText("Bonjour "+name);
    }
}
