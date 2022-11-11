package ru.kleverkzn.sings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listViewCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        listViewCategory = findViewById(R.id.ListViewCategory);
        listViewCategory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case  0:
                        Intent intentDescription = new Intent(getApplicationContext(), DescriptionRunsActivity.class);
                        startActivity(intentDescription);
                        break;
                    case  1:
                        Intent intentDivinations = new Intent(getApplicationContext(), DivinationRunsActivity.class);
                        startActivity(intentDivinations);
                        break;
                    case  2:
                        Intent intentLiveRun = new Intent(getApplicationContext(), LiveRunActivity.class);
                        startActivity(intentLiveRun);
                        break;
                    case  3:
                        Intent intentMagicRun = new Intent(getApplicationContext(), MagicRunsActivity.class);
                        startActivity(intentMagicRun);
                        break;
                }
            }
        });
    }
}