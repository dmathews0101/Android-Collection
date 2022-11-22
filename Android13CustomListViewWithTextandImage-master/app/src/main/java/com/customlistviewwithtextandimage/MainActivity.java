package com.customlistviewwithtextandimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] vehicles = {
            "Airplane",
            "Auto",
            "Bus",
            "Car",
            "Cycle",
            "Helicopter",
            "Jeep",
            "Ship",
            "Tractor",
            "Train",
            "Truck"
    };

    int[] images = {
            R.drawable.airplane,
            R.drawable.auto,
            R.drawable.bus,
            R.drawable.car,
            R.drawable.cycle,
            R.drawable.helicopter,
            R.drawable.jeep,
            R.drawable.ship,
            R.drawable.tractor,
            R.drawable.train,
            R.drawable.truck
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView1);
        ListAdapter adapter = new ListAdapter(this, vehicles, images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You Clicked "+position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
