package com.example.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.practice.model.Plats;

public class DetailPlat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_plat);

        Plats plat = (Plats)getIntent().getSerializableExtra("plat");

        TextView tv1 = findViewById(R.id.detail_text);
        TextView tv2 = findViewById(R.id.detail_prix);
        TextView tv3 = findViewById(R.id.detail_description);
        ImageView img = findViewById(R.id.detail_image);
        tv1.setText(plat.getLabel());
        tv2.setText(plat.getPrix() + " €");
        tv3.setText(plat.getDescription());

        int id = this.getResources().getIdentifier(plat.getImageURL(), "drawable", this.getPackageName());
        img.setImageResource(id);
    }
}
