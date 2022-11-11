package ru.kleverkzn.sings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class FormulaTypesActivity extends AppCompatActivity {


    private ListView listViewFormulaTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula_types);

        listViewFormulaTypes = findViewById(R.id.ListViewFormulaTypes);

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