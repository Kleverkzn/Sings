package ru.kleverkzn.sings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class FormulaTypesActivity extends AppCompatActivity {

    private WebView webViewFormulaTypes;
    private ListView listViewFormulaTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula_types);

        webViewFormulaTypes  = findViewById(R.id.WebViewFopmulaTypes);
        listViewFormulaTypes = findViewById(R.id.ListViewFormulaTypes);

        webViewFormulaTypes.loadUrl("file:///android_asset/formula_types.html");
        setTitle("Виды формул");

        listViewFormulaTypes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), StavyActivity.class);
                intent.putExtra("id", position);
                startActivity(intent);

            }
        });
    }
}