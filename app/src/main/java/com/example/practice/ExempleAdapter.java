package com.example.practice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ExempleAdapter extends ArrayAdapter {


    public ExempleAdapter(Context context, int resource) {
        super(context, resource);

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.getContext());
        View v = inflater.inflate(R.layout.plat_item, null);
        Object data = this.getItem(position);
        TextView tv1 = v.findViewById(R.id.item_text);
        tv1.setText(data.toString());
        return v;
    }


}