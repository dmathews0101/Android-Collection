package com.example.jlidou.demostartactivityintent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {


    Button btn;
    Context ctx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("debugApp" , "Oncreate");

        btn = findViewById(R.id.button);

        ctx = this;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ctx, SecondActivity.class);
                startActivity(intent);

            }
        });




    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debugApp" , "OnStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debugApp" , "OnResume");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debugApp" , "OnRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debugApp" , "Oncreate");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debugApp" , "Oncreate");
    }
}
