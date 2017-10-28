package com.example.fadumaahmed.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener  {

    Button Register;
    EditText etUser,etPassword,etName,etAge,etGender,etAddress;
    public void onClick(View view) {

        if(view.getId() == R.id.Register)
        {

        }


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        etUser = (EditText) findViewById(R.id.etUser);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);
        etGender = (EditText) findViewById(R.id.etGender);
        etAddress = (EditText) findViewById(R.id.etAddress);
        Register = (Button) findViewById(R.id.Register);

        Register.setOnClickListener(this);







    }

}
