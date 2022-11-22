package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    String TAG = "SecondActivity";
    Button btn_testing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.democonstraintlayout);

        Log.e(TAG,  "onCreate");
        btn_testing =(Button) findViewById(R.id.btn_testing);
      btn_testing.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent =new Intent(getApplicationContext(), SecondActivity.class);
              startActivity(intent);
          }
      });
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e(TAG,  "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }
}
