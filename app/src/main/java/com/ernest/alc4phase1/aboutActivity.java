package com.ernest.alc4phase1;

import android.net.http.SslError;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aboutActivity extends AppCompatActivity {

    WebView alcWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        alcWeb = (WebView)findViewById(R.id.alcWeb);
        alcWeb.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();
            }
                                });
        alcWeb.loadUrl("https://www.andela.com/alc");

        WebSettings webSettings = alcWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public void onBackPressed() {
        if(alcWeb.canGoBack()){
            alcWeb.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
