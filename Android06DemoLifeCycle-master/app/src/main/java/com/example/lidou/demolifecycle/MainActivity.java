package com.example.lidou.demolifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("debug", "Oncreate is called");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debug", "OnStart is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug", "onREseume is called");
    }


    @Override
    protected void onPause() {
        super.onPause();Log.d("debug", "onPause is called");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug", "onStop is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug", "onDestroy is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debug", "onR is called");
    }
}
