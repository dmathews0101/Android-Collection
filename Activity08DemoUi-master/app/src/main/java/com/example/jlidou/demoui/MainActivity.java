package com.example.jlidou.demoui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {


    LinearLayout ll;
    Context ctx;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctx = this;
        ll = findViewById(R.id.ll_button);


        for (int i = 0; i < 10; i++) {
            btn = new Button(ctx);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btn.setBackgroundColor(Color.rgb(getNb(),getNb(),getNb()));

                }
            });
            btn.setText("Button " + i);
            ll.addView(btn);
        }
    }


    public int getNb(){
        return (int) (Math.random()*255);
    }
}
