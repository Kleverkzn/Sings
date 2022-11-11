package ru.kleverkzn.sings;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class LiveRunActivity extends AppCompatActivity {

    private WebView vebVievLiveRuns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_run);

        vebVievLiveRuns  = findViewById(R.id.WebViewLiveRuns);

        vebVievLiveRuns.loadUrl("file:///android_asset/live_runs.html");
        setTitle("Проживание рун");
    }
}