package com.example.covid;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class precautions extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precautions);

        //Get a reference to your WebView//
        WebView webView = findViewById(R.id.webview);

//Specify the URL you want to display//
        webView.loadUrl("https://covid19.karnataka.gov.in/english");
    }
}