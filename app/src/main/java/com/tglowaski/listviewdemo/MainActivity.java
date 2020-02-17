package com.tglowaski.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.class_schedule);

        Resources res = getResources();
        final String[] classes = res.getStringArray(R.array.semester_classes);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, classes);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast toast = Toast.makeText(getApplicationContext(), "You clicked: " + classes[i], Toast.LENGTH_SHORT);
                    toast.show();
            }
        });
    }
}
