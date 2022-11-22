package com.skanderjabouzi.buttonsexcercice;

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
                checkBox.setVisibility(View.VISIBLE);
                aSwitch.setVisibility(View.VISIBLE);
                toggleButton.setVisibility(View.VISIBLE);
                break;
            case R.id.radioButton2:
                checkBox.setVisibility(View.GONE);
                aSwitch.setVisibility(View.GONE);
                toggleButton.setVisibility(View.GONE);
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if (isChecked) {
            switch (compoundButton.getId()) {
                case R.id.checkBox:
                    aSwitch.setChecked(false);
                    toggleButton.setChecked(false);
                    break;
                case R.id.switch1:
                    checkBox.setChecked(false);
                    toggleButton.setChecked(false);
                    break;
                case R.id.toggleButton:
                    checkBox.setChecked(false);
                    aSwitch.setChecked(false);
                default:
                    break;
            }
        }
    }
}
