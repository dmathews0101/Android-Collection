package com.exercise03actionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class activityC extends AppCompatActivity {

    Button btn1;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        btn1 = (Button) findViewById(R.id.btnSave);
        et1 = (EditText) findViewById(R.id.etc);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returndata = new Intent();
                returndata.putExtra("rtext",et1.getText().toString());
                setResult(RESULT_OK, returndata);
                finish();
            }
        });
    }
}
