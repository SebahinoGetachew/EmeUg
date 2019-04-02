package com.example.emeug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choice extends AppCompatActivity implements View.OnClickListener{
    Button login, sigup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        login=(Button) findViewById(R.id.login2);
        sigup=(Button) findViewById(R.id.signup2);

        login.setOnClickListener(this);

        sigup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==login){
            startActivity(new Intent(getApplicationContext(),login.class));
        }
        if(v==sigup){
            startActivity(new Intent(getApplicationContext(),signup.class));
        }

    }
}
