package com.listviewexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ArrayList<String> al_items;
    ArrayList<Integer> al_images;
    ListView lv_details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lv_details = (ListView)findViewById(R.id.lv_details);

        al_items = new ArrayList<>();
        al_images = new ArrayList<>();

        al_items.add("Airplane");
        al_items.add("Auto");
        al_items.add("Bus");
        al_items.add("Car");
        al_items.add("Cycle");
        al_items.add("Helicopter");
        al_items.add("Jeep");
        al_items.add("Ship");
        al_items.add("Tractor");
        al_items.add("Train");
        al_items.add("Truck");

        al_images.add(R.drawable.airplane);
        al_images.add(R.drawable.auto);
        al_images.add(R.drawable.bus);
        al_images.add(R.drawable.car);
        al_images.add(R.drawable.cycle);
        al_images.add(R.drawable.helicopter);
        al_images.add(R.drawable.jeep);
        al_images.add(R.drawable.ship);
        al_images.add(R.drawable.tractor);
        al_images.add(R.drawable.train);
        al_images.add(R.drawable.truck);



        customAdapter cust = new customAdapter(getApplicationContext(),al_images,al_items);
        lv_details.setAdapter(cust);


    }
}
