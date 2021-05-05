package com.example.raniamofeed.project_androidfci;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.Calendar;

import static android.content.ContentValues.TAG;

public class ProfileDoctor extends AppCompatActivity {
    private TextView tv;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    TabHost tabh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_doctor);
        final TabHost tab=(TabHost)findViewById(R.id.ta);
        tab.setup();
        TabHost.TabSpec specl=tab.newTabSpec("personal information");
        specl.setIndicator("personal information");
        specl.setContent(R.id.tab1);
        tab.addTab(specl);

        TabHost.TabSpec spec2=tab.newTabSpec("Evaluation");
        spec2.setIndicator("Evaluation");
        spec2.setContent(R.id.tab2);
        tab.addTab(spec2);


        ////////////////////////////////////////////


        //////////////////////////////////////////////

        tv=(TextView) findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal=Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog=new DatePickerDialog
                        (ProfileDoctor.this,android.R.style.Theme_Holo_Light_Dialog,mDateSetListener,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });
        mDateSetListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month=month+1;
                Log.d(TAG,"onDataSet:mm/dd/yyy:" +year+"/"+month+"/"+day);
                String date=month+"/"+day+"/"+year;
                tv.setText(date);


            }
        };


    }
}
