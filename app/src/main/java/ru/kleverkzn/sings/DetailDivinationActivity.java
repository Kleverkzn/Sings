package ru.kleverkzn.sings;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailDivinationActivity extends AppCompatActivity {

    private WebView webViewDivination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divination);
        webViewDivination = findViewById(R.id.webWievDivination);

        Intent intent = getIntent();

        if (intent.hasExtra("id")){
            int id = intent.getIntExtra("id", -1);
            switch (id){
                case  0:
                    webViewDivination.loadUrl("file:///android_asset/pep_divination.html");
                    break;
                case  1:
                    webViewDivination.loadUrl("file:///android_asset/throw_one_rune.html");
                    break;
                case  2:
                    webViewDivination.loadUrl("file:///android_asset/divination_of_3_runes.html");
                    break;
                case  3:
                    webViewDivination.loadUrl("file:///android_asset/divination_of_life.html");
                    break;
                case  4:
                    webViewDivination.loadUrl("file:///android_asset/guess_who_am_i.html");
                    break;
                case  5:
                    webViewDivination.loadUrl("file:///android_asset/divination_cross_1.html");
                    break;
                case  6:
                    webViewDivination.loadUrl("file:///android_asset/divination_cross_2.html");
                    break;
            }
        }
    }
}