package com.listviewexercise;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class customAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> al_items;
    ArrayList<Integer> al_images;

    public customAdapter(Context context, ArrayList<Integer> al_images ,ArrayList<String> al_items) {
        this.context = context;
        this.al_images = al_images;
        this.al_items = al_items;
    }

    @Override
    public int getCount() {
        return al_items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.customlayout, parent, false);
            viewHolder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.iv_name = (ImageView) convertView.findViewById(R.id.ivvehicle);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder)convertView.getTag();
        }


        viewHolder.tv_name.setText(al_items.get(position));
        viewHolder.iv_name.setImageResource(al_images.get(position));

        return convertView;
        }

    private static class ViewHolder{
        TextView tv_name; //tv_email;
        ImageView iv_name;
    }
}
