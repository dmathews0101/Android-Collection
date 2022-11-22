package com.example.jlidou.demointent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button btnA,btnB,btnE;
    EditText ed;
    TextView tv;
    Context ctx;

    static int idRequest = 165465;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctx = this;

        btnA = findViewById(R.id.btn_maina);
        btnB = findViewById(R.id.btn_mainb);
        btnE = findViewById(R.id.btn_maine);
        ed = findViewById(R.id.ed_mainb);
        tv = findViewById(R.id.tv_maine);


        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ctx, ActivityA.class);
                startActivity(intent);
            }
        });



        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String messageToSend = ed.getText().toString();

                Intent intent = new Intent(ctx, ActivityB.class);

                intent.putExtra("msg", messageToSend);
                startActivity(intent);
            }
        });


        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ctx, ActivityE.class);
                startActivityForResult(intent,idRequest);


            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if(resultCode == RESULT_OK && requestCode == idRequest){
          tv.setText(data.getStringExtra("returnMsg"));

        }


    }
}
