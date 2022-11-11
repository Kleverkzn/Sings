package ru.kleverkzn.sings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class DivinationRunsActivity extends AppCompatActivity {

    private ListView listViewDivination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divination_runs);
        listViewDivination = findViewById(R.id.divinationruns);
        listViewDivination.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetailDivinationActivity.class);
                intent.putExtra("id", position);
                startActivity(intent);

            }
        });

    }
}