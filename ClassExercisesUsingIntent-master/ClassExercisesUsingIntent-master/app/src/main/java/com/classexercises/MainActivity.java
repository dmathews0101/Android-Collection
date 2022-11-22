package com.classexercises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String log;
    String TAG = "Activity1";

    Button btn_testing;
    TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "MA onCreate");

        log="Log : ";

        btn_testing =(Button) findViewById(R.id.btn_testing1);
        tv_name= (TextView) findViewById(R.id.textView1);
        tv_name.setText("MA onCreate ");

        btn_testing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(), Activity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        tv_name.setText("MA onStart ");
        Log.e(TAG, "MA onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        tv_name.setText("MA onResume ");

        Log.e(TAG, "MA onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        tv_name.setText("MA onPause ");

        Log.e(TAG, "MA onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        tv_name.setText("MA onStop ");

        Log.e(TAG, "MA onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        tv_name.setText("MA onDestroy ");

        Log.e(TAG, "MA onDestroy");
    }

}
