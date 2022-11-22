package com.example.jlidou.demoui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TestRessourceActivity extends Activity {


    TextView tv_start, tv_end;
    LinearLayout llList;
    Context ctx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_ressource);
        ctx = this;
        tv_start = findViewById(R.id.mon_tv);
        tv_end = findViewById(R.id.tv_end);
        tv_end.setTextColor(getResources().getColor(R.color.couleur_text));
        llList= findViewById(R.id.ll_liste);


        tv_start.setText(getResources().getString(R.string.message_bvn));
        tv_end.setText(getResources().getString(R.string.message_end));

        String[] fruitList= getResources().getStringArray(R.array.liste);

        for (String s: fruitList) {
            TextView tv = new TextView(ctx);
            tv.setText(s);

            llList.addView(tv);
        }


    }
}
