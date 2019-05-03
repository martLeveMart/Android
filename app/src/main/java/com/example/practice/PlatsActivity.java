package com.example.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class PlatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plats);

        ListView liste = findViewById(R.id.liste_plats);
        ExempleAdapter a = new ExempleAdapter(this, 0);
        a.add("comment");
        a.add("tu");
        a.add("vas");
        a.add("?");
        a.add("?");
        a.add("?");
        liste.setAdapter(a);
    }
}
