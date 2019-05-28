package com.example.practice;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.net.MalformedURLException;
import java.net.URL;

public class DisplayAvis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_avis);

        try{
            URL url = new URL("http://formation-pro.eu:8080/avis");
            new DownloadAvis(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, url);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

}
