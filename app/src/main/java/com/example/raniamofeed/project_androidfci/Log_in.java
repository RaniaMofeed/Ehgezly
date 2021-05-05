package com.example.raniamofeed.project_androidfci;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Log_in extends AppCompatActivity {
        Button re1,re2,re3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        re1 = (Button) findViewById(R.id.logiin);
        re2 = (Button) findViewById(R.id.b2);
        re3 = (Button) findViewById(R.id.textView2);
        re1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Log_in.this, Search.class);
                startActivity(intent);
            }
        });
        re2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Log_in.this, Forget_Pass.class);
                startActivity(intent);
            }
        });
        re3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Log_in.this, Regsister.class);
                startActivity(intent);
            }
        });


    }
}
