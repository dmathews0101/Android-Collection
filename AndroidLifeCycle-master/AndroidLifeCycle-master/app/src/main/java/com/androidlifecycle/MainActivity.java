package com.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String log;
    String TAG = "MainActivity";

    Button btn_testing;
    TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "MA onCreate");

        log="Log : ";

        log+=" \n onCreate";
        btn_testing =(Button) findViewById(R.id.btn_testing1);
        tv_name= (TextView) findViewById(R.id.textView1);


        btn_testing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_name.setText(log);
                /*
                *                 Intent intent =new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);*/

            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        log+= "\n onStart";
        Log.e(TAG, "MA onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        log+= "\n onResume";

        Log.e(TAG, "MA onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        log+= "\n onPause";

        Log.e(TAG, "MA onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        log+= "\n onStop";

        Log.e(TAG, "MA onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        log+= "\n onDestroy";

        Log.e(TAG, "MA onDestroy");
    }

}
