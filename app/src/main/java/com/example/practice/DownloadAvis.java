package com.example.practice;

import android.os.AsyncTask;
import android.util.Log;

import com.example.practice.model.Avis;

import java.io.IOException;
import java.net.URL;

public class DownloadAvis extends AsyncTask<URL, Integer, Avis[]> {

    @Override
    protected Avis[] doInBackground(URL... urls){
        try{
            publishProgress(1);
            Avis[] result = Util.getAvis(urls[0]);
            publishProgress(99);
            return result;
        }catch (IOException e){
            return new Avis[0];
        }
    }

    protected void onPostExecute(Avis[] avis){
        Log.i("AVIS", "J'ai " + avis.length + " avis.");
    }
}
