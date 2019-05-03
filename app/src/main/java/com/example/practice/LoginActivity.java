package com.example.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void seConnecter(View v){
        EditText login = (EditText)findViewById(R.id.id_login);
        EditText password = (EditText)findViewById(R.id.id_password);

        String loginStr = login.getText().toString();
        String passwordStr = password.getText().toString();

        if(loginStr.equals("martin") && passwordStr.equals("toto")){
            Intent i = new Intent(this, MenuActivity.class);
            startActivity(i);
        }else{
            Toast.makeText(this, "zr", Toast.LENGTH_LONG).show();
        }
    }
}
