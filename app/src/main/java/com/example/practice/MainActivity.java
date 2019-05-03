package com.example.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.w("ETAT", "CREATE");
    }

    protected void onPause(){
        super.onPause();
        Log.w("ETAT", "PAUSE");
    }

    protected void onResume(){
        super.onResume();
        Log.w("ETAT", "RESUME");
    }

    protected void onStop(){
        super.onStop();
        Log.w("ETAT", "STOP");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.w("ETAT", "DESTROY");
    }

    protected void onStart(){
        super.onStart();
        Log.w("ETAT", "START");
    }
}
