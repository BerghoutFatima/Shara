package com.example.shara;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shara.models.User;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class Activity1 extends AppCompatActivity {

    private DatabaseReference mDatabase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_details);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("produit").setValue("test1");

            }
    private void writeNewUser(String userId, String name, String email) {
        User user = new User(name, email);

      //  mDatabase.child("users").child(userId).setValue(user);
    }

}