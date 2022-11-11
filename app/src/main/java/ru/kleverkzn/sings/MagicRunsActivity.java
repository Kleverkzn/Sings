package ru.kleverkzn.sings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MagicRunsActivity extends AppCompatActivity {

    private ListView listViewMagic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic_runs);
        listViewMagic = findViewById(R.id.ListViewMagic);
        listViewMagic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case  0:
                        Intent intentSafety = new Intent(getApplicationContext(), SafetyActivity.class);
                        startActivity(intentSafety);
                        break;
                    case  1:
                        Intent intentFormulaTypes = new Intent(getApplicationContext(), FormulaTypesActivity.class);
                        startActivity(intentFormulaTypes);
                        break;
//                    case  2:
//                        Intent intentLiveRun = new Intent(getApplicationContext(), LiveRunActivity.class);
//                        startActivity(intentLiveRun);
//                        break;
//                    case  3:
//                        Intent intentMagicRun = new Intent(getApplicationContext(), MagicRunsActivity.class);
//                        startActivity(intentMagicRun);
//                        break;
                }
            }
        });
    }
}