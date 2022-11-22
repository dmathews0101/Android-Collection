package com.example.jlidou.demostartactivityintent;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("debugApp" , "Oncreate 2");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debugApp" , "OnStart 2");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debugApp" , "OnResume 2");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debugApp" , "OnRestart 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debugApp" , "onPause 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debugApp" , "onStop 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debugApp" , "onDestroy 2");
    }
}
