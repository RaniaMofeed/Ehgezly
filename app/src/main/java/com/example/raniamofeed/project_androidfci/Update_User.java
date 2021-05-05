package com.example.raniamofeed.project_androidfci;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Update_User extends AppCompatActivity {
    Spinner up;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update__user);
        up=(Spinner)findViewById(R.id.sp);
        adapter=ArrayAdapter.createFromResource(this,R.array.Area,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        up.setAdapter(adapter);
    }
}
