package com.example.raniamofeed.project_androidfci;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Search extends AppCompatActivity {
        Spinner s1,s2,s3,s4;
        ArrayAdapter<CharSequence> adapter;
        Button Search1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        s1=(Spinner)findViewById(R.id.sp3);
        adapter=ArrayAdapter.createFromResource(this,R.array.Specialization,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);

        s2=(Spinner)findViewById(R.id.sp5);
        adapter=ArrayAdapter.createFromResource(this,R.array.Range,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter);

        s3=(Spinner)findViewById(R.id.sp6);
        adapter=ArrayAdapter.createFromResource(this,R.array.Scientific,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(adapter);

        s4=(Spinner)findViewById(R.id.sp4);
        adapter=ArrayAdapter.createFromResource(this,R.array.Area,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s4.setAdapter(adapter);

        Search1=(Button)findViewById(R.id.found);
        Search1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Search.this,ResultSearch.class);
                startActivity(intent);
            }
        });
    }
}
