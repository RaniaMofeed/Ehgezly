package com.example.raniamofeed.project_androidfci;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class Doctor_Update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor__update);
        TabHost tab=(TabHost)findViewById(R.id.ta);
        tab.setup();

        TabHost.TabSpec specl=tab.newTabSpec("personal information");
        specl.setIndicator("personal information");
        specl.setContent(R.id.tab1);
        tab.addTab(specl);

        TabHost.TabSpec spec2=tab.newTabSpec("Anther Info");
        spec2.setIndicator("Anther Info");
        spec2.setContent(R.id.tab2);
        tab.addTab(spec2);

    }
}
