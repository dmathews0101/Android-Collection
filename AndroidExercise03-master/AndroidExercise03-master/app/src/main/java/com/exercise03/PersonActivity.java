package com.exercise03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4;
    ImageView iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        int imageid= extra.getInt("id");

        tv1 = (TextView)findViewById(R.id.tvfn);
        tv2 = (TextView)findViewById(R.id.tvln);
        tv3 = (TextView)findViewById(R.id.tvage);
        tv4 = (TextView) findViewById(R.id.tvcity);
        iv1 = (ImageView) findViewById(R.id.ivperson);

        switch (imageid){
            case 0:   tv1.setText(MainActivity.al_details.get(0).getStr_name());
                        tv2.setText(MainActivity.al_details.get(0).getStr_lastname());
                        tv3.setText(MainActivity.al_details.get(0).getStr_age());
                        tv4.setText(MainActivity.al_details.get(0).getStr_details());
                        iv1.setImageResource(MainActivity.al_details.get(0).getImage());
                        break;
            case 1:   tv1.setText(MainActivity.al_details.get(1).getStr_name());
                        tv2.setText(MainActivity.al_details.get(1).getStr_lastname());
                        tv3.setText(MainActivity.al_details.get(1).getStr_age());
                        tv4.setText(MainActivity.al_details.get(1).getStr_details());
                        iv1.setImageResource(MainActivity.al_details.get(1).getImage());
                        break;
            case 2:   tv1.setText(MainActivity.al_details.get(2).getStr_name());
                        tv2.setText(MainActivity.al_details.get(2).getStr_lastname());
                        tv3.setText(MainActivity.al_details.get(2).getStr_age());
                        tv4.setText(MainActivity.al_details.get(2).getStr_details());
                        iv1.setImageResource(MainActivity.al_details.get(2).getImage());
                        break;
            case 3:   tv1.setText(MainActivity.al_details.get(3).getStr_name());
                        tv2.setText(MainActivity.al_details.get(3).getStr_lastname());
                        tv3.setText(MainActivity.al_details.get(3).getStr_age());
                        tv4.setText(MainActivity.al_details.get(3).getStr_details());
                        iv1.setImageResource(MainActivity.al_details.get(3).getImage());
                        break;

        }

    }
}
