package ru.kleverkzn.sings;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class SafetyActivity extends AppCompatActivity {

    public WebView webViewSafety;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety);

        webViewSafety  = findViewById(R.id.webViewSafety);

        webViewSafety.loadUrl("file:///android_asset/MagicPage/safety.html");
        setTitle("Техника безопасности");
    }
}