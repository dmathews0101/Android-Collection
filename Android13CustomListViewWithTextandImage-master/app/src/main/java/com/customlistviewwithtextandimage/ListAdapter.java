package com.customlistviewwithtextandimage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListAdapter extends ArrayAdapter <String> {
    Context context;
    String[] vehicleList;
    int[] images;
    LayoutInflater inflater;

    public ListAdapter (@NonNull Context context, String[] vehs, int[] imgs ){
        super(context, R.layout.listview_layout,vehs);
        this.context = context;
        vehicleList = vehs;
        images = imgs;
        inflater = (LayoutInflater.from(context));
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        view = inflater.inflate(R.layout.listview_layout,null);
        TextView text =view.findViewById(R.id.text);
        ImageView image = view.findViewById(R.id.image);
        text.setText(vehicleList[position]);
        image.setImageResource(images[position]);
        return view;
    }
}
