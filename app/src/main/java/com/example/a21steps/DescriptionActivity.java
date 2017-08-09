package com.example.a21steps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ячсчяс on 12.07.2017.
 */

public class DescriptionActivity extends AppCompatActivity{
    Button btnInfo;
    Button btnExc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step1_description);
        btnInfo = (Button)findViewById(R.id.buttonInfo);
        btnExc=(Button)findViewById(R.id.buttonExc);
        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setContentView(R.layout.step1_info);
            }
        };
        View.OnClickListener oclBtnExc = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                setContentView(R.layout.step1_activity);
            }
        };


        btnInfo.setOnClickListener(oclBtn);
        btnExc.setOnClickListener(oclBtnExc);
    }


}
