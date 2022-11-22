package com.example.jlidou.demointent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends Activity {

    TextView tv;
    Context ctx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ctx = this;
        // view without using xml
//        tv = new TextView(ctx);
//        Intent intentDeRetour = getIntent();
//        tv.setText(intentDeRetour.getStringExtra("msg"));
//        setContentView(tv);



        setContentView(R.layout.activity_b);
        tv = findViewById(R.id.tv_activity_b);
        Intent intent = getIntent();

        String messageSinceMainActivity = intent.getStringExtra("msg");

        tv.setText(messageSinceMainActivity);

    }
}
