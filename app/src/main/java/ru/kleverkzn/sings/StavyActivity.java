package ru.kleverkzn.sings;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class StavyActivity extends AppCompatActivity {

    private WebView webViewStavy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stavy);

        webViewStavy = findViewById(R.id.WebViewStavy);
        webViewStavy.loadUrl("file:///android_asset/stavy/stavy.html");
        setTitle("Ставы");

    }
}