package com.classexercises;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Activity2 extends AppCompatActivity {

    String TAG = "Activity2";

    Button btn_testing;
    TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.e(TAG, "SA onCreate");

        btn_testing =(Button) findViewById(R.id.btn_testing2);
        tv_name= (TextView) findViewById(R.id.textView2);

        tv_name.setText("SA onCreate ");

        btn_testing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                 *                 Intent intent =new Intent(getApplicationContext(), DummyActivity.class);
                 * */
                Intent intent =new Intent(getApplicationContext(), Activity1.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        tv_name.setText("SA onStart ");
        Log.e(TAG, "SA onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        tv_name.setText("SA onResume ");
        Log.e(TAG, "SA onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        tv_name.setText("SA onPause ");
        Log.e(TAG, "SA onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        tv_name.setText("SA onStop ");
        Log.e(TAG, "SA onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        tv_name.setText("SA onDestroy ");
        Log.e(TAG, "SA onDestroy");
    }

}
