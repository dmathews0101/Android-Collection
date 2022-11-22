package com.example.lidou.demologcat;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int i = 4;


        Log.d("foo", "debug value" + i);

//        Etu e;
//
//        e.test();
    }
}


class Etu {

    void test(){}
}