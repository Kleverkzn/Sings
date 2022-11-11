package ru.kleverkzn.sings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class DescriptionRunsActivity extends AppCompatActivity {

    private ListView listViewDescRunes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_runs);
        listViewDescRunes = findViewById(R.id.listViewDescRunes);
        listViewDescRunes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Intent intent = new Intent(getApplicationContext(), DetailRunActivity.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                }

        });

    }
}