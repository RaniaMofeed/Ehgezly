package com.example.raniamofeed.project_androidfci;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Regsister extends AppCompatActivity {
    Spinner s;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regsister);

        s=(Spinner)findViewById(R.id.sp);
        adapter=ArrayAdapter.createFromResource(this,R.array.Area,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

    }
}
