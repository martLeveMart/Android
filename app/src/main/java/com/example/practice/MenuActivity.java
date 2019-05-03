package com.example.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onMenu(View v){
        switch (v.getId()){
            case R.id.menu:
                Intent i = new Intent(this, PlatsActivity.class);
                startActivity(i);
                break;
            case R.id.upload:
                break;
            case R.id.fav:
                Intent fav = new Intent(this, FavActivity.class);
                startActivity(fav);
                break;
            case R.id.map:
                break;
        }
    }
}
