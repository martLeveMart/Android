package com.example.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.practice.plats.*;

public class PlatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plats);

        ListView liste = findViewById(R.id.liste_plats);
        ExempleAdapter a = new ExempleAdapter(this, 0);

        Plats p1 = new Plats("plat1", "Crevettes Ananas", 12.0);
        Plats p2 = new Plats("plat2", "Crevettes Ananas", 13.0);
        Plats p3 = new Plats("plat3", "Crevettes Ananas", 14.0);
        Plats p4 = new Plats("plat4", "Crevettes Ananas", 15.0);
        Plats p5 = new Plats("plat5", "Crevettes Ananas", 16.0);

        a.add(p1);
        a.add(p2);
        a.add(p3);
        a.add(p4);
        a.add(p5);
        liste.setAdapter(a);
    }
}
