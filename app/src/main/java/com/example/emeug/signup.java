package com.example.emeug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class signup extends AppCompatActivity {
private Button signup, login;
private EditText phn ,pwd,email,sname,fname,dob;
private RadioButton male,  female;
private RadioGroup sex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signup=(Button)findViewById(R.id.signup1);
        login=(Button)findViewById(R.id.loginsignup);
        fname=(EditText)findViewById(R.id.fname);
        sname=(EditText)findViewById(R.id.sname);
        email=(EditText)findViewById(R.id.email);
        dob=(EditText)findViewById(R.id.dob);
        phn=(EditText)findViewById(R.id.telsignup);
        pwd=(EditText)findViewById(R.id.pwd);
        male=(RadioButton) findViewById(R.id.male);
        female=(RadioButton) findViewById(R.id.female);
        sex=(RadioGroup)findViewById(R.id.sex);
    }


    private void meet(){
        String fnm=fname.getText().toString().trim();
        String snm=sname.getText().toString().trim();
        String eml=email.getText().toString().trim();
        String date=dob.getText().toString().trim();
        String pass=pwd.getText().toString().trim();
        String genda;



        if(TextUtils.isEmpty(fnm)){

            Toast.makeText(this,"Please enter your firstname",Toast.LENGTH_SHORT).show();
            return;
    }
        if(TextUtils.isEmpty(snm)) {

            Toast.makeText(this, "Please enter your surname", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(eml)) {

            Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(date)) {

            Toast.makeText(this, "Please enter your Date of birth", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(pass)|| pass.length()<8) {

            Toast.makeText(this, "Please enter your password correctly", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}
