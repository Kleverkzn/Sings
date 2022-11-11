package ru.kleverkzn.sings;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class StavyActivity extends AppCompatActivity {

    private WebView webViewStavy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stavy);

        Intent intent = getIntent();


        webViewStavy = findViewById(R.id.WebViewStavy);

        if (intent.hasExtra("id")) {
            int id = intent.getIntExtra("id", -1);
            switch (id) {
                case 0:
                    webViewStavy.loadUrl("file:///android_asset/stavy/formula_types.html");
                    setTitle("Предисловие");
                    break;
                case 1:
                    webViewStavy.loadUrl("file:///android_asset/stavy/stavy.html");
                    setTitle("Ставы");
                    break;
            }


        }

    }
}