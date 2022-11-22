package com.exercise03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView img1, img2, img3, img4;

    public  static ArrayList<PersonDetails> al_details = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getResources().getDrawable(R.drawable.person1)
        al_details.add(new PersonDetails("Alex","Smith","20","Canberra", R.drawable.person1));
        al_details.add(new PersonDetails("James","Mathew","22","Montreal", R.drawable.person2));
        al_details.add(new PersonDetails("Catherine","Philip","19","Toronto", R.drawable.person3));
        al_details.add(new PersonDetails("Nina","Joe","18","Sydney", R.drawable.person4));

        Toast.makeText(getApplicationContext(), al_details.get(0).getStr_name(), Toast.LENGTH_SHORT).show();

        img1 = (ImageView) findViewById(R.id.p1);
        img2 = (ImageView) findViewById(R.id.p2);
        img3 = (ImageView) findViewById(R.id.p3);
        img4 = (ImageView) findViewById(R.id.p4);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);

/*        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PersonActivity.class);
                //intent.putExtra();_


                switch (v.getId()){
                    case R.id.p1:
                        intent.putExtra("id",0);
                        startActivity(intent);
                }

            }
        });*/


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),PersonActivity.class);

        switch (v.getId()){
            case R.id.p1:
                intent.putExtra("id",0);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), img1.getId() + " was clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.p2:
                intent.putExtra("id",1);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), img2.getId() + " was clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.p3:
                intent.putExtra("id",2);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), img3.getId() + " was clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.p4:
                intent.putExtra("id",3);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), img4.getId() + " was clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
