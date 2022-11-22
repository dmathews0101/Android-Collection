package com.simplelistviewwitharrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] strList = {"Montreal", "Toronto","Ottawa","Vancouver", "Berlin","New York"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.list_item_layout, R.id.textView, strList);
        listView.setAdapter(arrayAdapter);
    }
}
