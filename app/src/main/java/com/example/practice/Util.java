package com.example.practice;

import com.example.practice.model.Avis;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

public class Util {

    public static Avis[] getAvis(URL url) throws IOException {
        Gson gson = new Gson();
        URLConnection connection = url.openConnection();
        InputStream ins = connection.getInputStream();
        Reader reader = new InputStreamReader(ins);
        return gson.fromJson(reader, Avis[].class);
    }
}
