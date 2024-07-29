package com.example.assignmentno1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the title
        TextView textViewTitle = findViewById(R.id.textViewTitle);
        textViewTitle.setText("Static Data List");

        // Get the static data
        List<String> data = StaticData.getData();

        // Set up the ListView
        ListView listViewData = findViewById(R.id.listViewData);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listViewData.setAdapter(adapter);
    }
}
