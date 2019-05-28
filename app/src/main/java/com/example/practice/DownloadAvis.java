package com.example.practice;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.example.practice.model.Avis;

import java.io.IOException;
import java.net.URL;

public class DownloadAvis extends AsyncTask<URL, Integer, Avis[]> {

    private DisplayAvis activity;

    public DownloadAvis(DisplayAvis activity){
        this.activity = activity;
    }

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
        ProgressBar progress = activity.findViewById(R.id.progress);
        progress.setVisibility(View.INVISIBLE);


        ListView liste = activity.findViewById(R.id.liste_avis);
        AvisAdapter avisAdapter = new AvisAdapter(this.activity);
        avisAdapter.addAll(avis);
        liste.setAdapter(avisAdapter);

        Log.i("AVIS", "J'ai " + avis.length + " avis.");
    }
}
