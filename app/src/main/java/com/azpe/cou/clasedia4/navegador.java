package com.azpe.cou.clasedia4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class navegador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador);

        WebView nav = (WebView)findViewById(R.id.webView);
        nav.loadUrl("http://www.google.es");
    }
}
