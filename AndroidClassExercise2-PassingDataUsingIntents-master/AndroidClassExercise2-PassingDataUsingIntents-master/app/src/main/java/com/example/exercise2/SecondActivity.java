package com.example.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText et_firstname;
    EditText et_lastname;

    TextView tv_view_sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent= getIntent();
        Bundle extra= intent.getExtras();

        String sName= extra.getString("fname");
        String lName= extra.getString("lname");
        String viewValue = extra.getString("view");

        et_firstname = (EditText) findViewById(R.id.etfnsa);
        et_lastname = (EditText) findViewById(R.id.etlnsa);
        tv_view_sa = (TextView) findViewById(R.id.view);


        et_firstname.setText(sName);
        et_lastname.setText(lName);
        tv_view_sa.setText(viewValue);
    }
}