package com.example.jlidou.demointent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class ActivityE extends Activity {
    Context ctx;
    EditText ed;
    Button btn;
    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ctx = this;

        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);

        ed = new EditText(ctx);

        ll.addView(ed);

        btn = new Button(ctx);
        btn.setText("Close");

        ll.addView(btn);


        setContentView(ll);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentReturn = new Intent();
                intentReturn.putExtra("returnMsg", ed.getText().toString());

                setResult(RESULT_OK, intentReturn);

                finish();

            }
        });

    }
}
