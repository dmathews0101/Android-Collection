package com.example.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_Continue;
    Button button_Cancel;
    EditText et_firstname;
    EditText et_lastname;
    RadioGroup rgbs;
    //RadioButton rbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_Continue = (Button) findViewById(R.id.btncontinue);
        button_Cancel = (Button) findViewById(R.id.btncancel);
        et_firstname = (EditText) findViewById(R.id.etfn);
        et_lastname = (EditText) findViewById(R.id.etln);
        rgbs = (RadioGroup) findViewById(R.id.radioGpBS);

        button_Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("fname",et_firstname.getText().toString());
                intent.putExtra("lname",et_lastname.getText().toString());

                //rbutton = (RadioButton) findViewById();
                //Log.e("MainActivity",rgbs.getCheckedRadioButtonId()+"");
                //Toast.makeText(getApplicationContext(),rgbs.getCheckedRadioButtonId()+"",Toast.LENGTH_SHORT).show();


                if (rgbs.getCheckedRadioButtonId()== R.id.rdbusiness){
                    intent.putExtra("view","Business");
                }else {
                    intent.putExtra("view","Social");
                }


               // intent.putExtra()
                startActivity(intent);
            }
        });

        button_Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You Pressed Cancel",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
