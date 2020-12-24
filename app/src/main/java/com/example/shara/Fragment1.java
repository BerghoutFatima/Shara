package com.example.shara;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fragment1 extends Fragment {
    View view;
    EditText username;
    EditText password;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.loginf1, container, false);
        username = (EditText) view.findViewById(R.id.myname);
        password = (EditText) view.findViewById(R.id.mypass);


        Button login = (Button)view.findViewById(R.id.ok);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(pass.equals("khaoula")){
                    Toast.makeText(view.getContext(), "Successful connection!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(view.getContext(),Activity1.class);
                    intent.putExtra("user",user);
                    startActivity(intent);
                }

                else{
                    Toast.makeText(view.getContext(), "Login failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}
