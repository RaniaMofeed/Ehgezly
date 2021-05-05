package com.example.raniamofeed.project_androidfci;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Setting extends AppCompatActivity {
    Spinner s1,s2;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        s1=(Spinner)findViewById(R.id.sp2);
        adapter=ArrayAdapter.createFromResource(this,R.array.Lan,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);


        s2=(Spinner)findViewById(R.id.sp);
        adapter=ArrayAdapter.createFromResource(this,R.array.No,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter);


    }
}
