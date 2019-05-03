package com.example.practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.practice.plats.*;

public class ExempleAdapter extends ArrayAdapter<Plats> {

    private int resource;


    public ExempleAdapter(Context context, int resource) {
        super(context, resource);
        this.resource = resource;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.getContext());
        View v = inflater.inflate(this.resource, null);
        Plats data = this.getItem(position);
        TextView tv1 = v.findViewById(R.id.item_text);
        TextView tv2 = v.findViewById(R.id.item_prix);
        ImageView img = v.findViewById(R.id.item_image);
        tv1.setText(data.getLabel());
        tv2.setText(data.getPrix() + " €");

        Context context = this.getContext();
        int id = context.getResources().getIdentifier(data.getImageURL(), "drawable", context.getPackageName());
        img.setImageResource(id);
        return v;
    }


}