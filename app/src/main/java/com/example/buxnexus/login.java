package com.example.buxnexus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class payment extends AppCompatActivity {
    WebView webView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


     webView = findViewById(R.id.WV);
    webView.getSettings().setJavaScriptEnabled(true);
    webView.getSettings().setBuiltInZoomControls(true);
    webView.getSettings().setDisplayZoomControls(true);
    webView.setWebViewClient(new WebViewClient());

    webView.loadUrl("https://rzp.io/l/j5DejKctu");
 //   String url = null;



    }

}
