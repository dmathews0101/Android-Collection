package com.skanderjabouzi.buttonsexmaples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener {

    TextView textView;
    RadioGroup radioGroup;
    CheckBox checkBox;
    Switch aSwitch;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        radioGroup = findViewById(R.id.radioGroup);

        checkBox = findViewById(R.id.checkBox);
        aSwitch = findViewById(R.id.switch1);
        toggleButton = findViewById(R.id.toggleButton);

        radioGroup.setOnCheckedChangeListener(this);
        checkBox.setOnCheckedChangeListener(this);
        aSwitch.setOnCheckedChangeListener(this);
        toggleButton.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int id) {
        switch (id) {
            case R.id.radioButton1:
                textView.setVisibility(View.VISIBLE);
                break;
            case R.id.radioButton2:
                textView.setVisibility(View.GONE);
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if (isChecked) {
            switch (compoundButton.getId()) {
                case R.id.checkBox:
                    textView.setText("Check Box Checked");
                    break;
                case R.id.switch1:
                    textView.setText("Switch is ON");
                    break;
                case R.id.toggleButton:
                    textView.setText("Toggle is ON");
                default:
                    break;
            }
        }
    }
}
