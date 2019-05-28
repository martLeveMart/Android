package com.example.practice;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practice.model.Avis;
import com.example.practice.model.Plats;

public class AvisAdapter extends ArrayAdapter<Avis> {

    public AvisAdapter(Context c){
        super(c, 0);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.getContext());

        View v = inflater.inflate(R.layout.fav_item, null);

        Avis data = this.getItem(position);
        TextView title = v.findViewById(R.id.title);
        TextView commentaire = v.findViewById(R.id.com);
        TextView mail = v.findViewById(R.id.mail);
        TextView note = v.findViewById(R.id.note);

        title.setText(data.getTitle());
        commentaire.setText(data.getDescription());
        mail.setText(data.getMail());
        note.setText(""+data.getNbStar());

        /*if (data.getNbStar() > 4){
            note.setBackgroundColor(Color.GREEN);
        }else if (data.getNbStar() < 1){
            note.setBackgroundColor(Color.RED);
        }else{
            note.setBackgroundColor(Color.YELLOW);
        }*/

        return v;
    }
}
