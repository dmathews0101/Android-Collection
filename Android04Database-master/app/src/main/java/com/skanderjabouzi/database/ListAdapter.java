package com.skanderjabouzi.database;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter<Person> {

    Context context;
    List<Person> list;
    LayoutInflater inflater;

    public ListAdapter(@NonNull Context context, List<Person> list) {
        super(context, R.layout.listview_layout, list);//
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater.from(context));//
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        view = inflater.inflate(R.layout.listview_layout, null);
        TextView firstname = view.findViewById(R.id.firstname);
        TextView lastname = view.findViewById(R.id.lastname);
        TextView age = view.findViewById(R.id.age);
        firstname.setText(list.get(position).getFirstname());
        lastname.setText(list.get(position).getLastname());
        age.setText(String.valueOf(list.get(position).getAge()));

        return view;
    }
}
