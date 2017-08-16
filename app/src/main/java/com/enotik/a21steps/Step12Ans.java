package com.enotik.a21steps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by User on 14.08.2017.
 */

public class Step12Ans extends AppCompatActivity {

    RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step12_answers);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rb1 = (RadioButton) findViewById(R.id.radioButtonStep12Right);
        rb2 = (RadioButton) findViewById(R.id.radioButtonStep12Wrong);

        Button clear = (Button) findViewById(R.id.button2);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()){
                    Intent intent = new Intent(Step12Ans.this, Step12Right.class);
                    Step12Ans.this.startActivity(intent);
                    finish();
                } else if(rb2.isChecked()){
                    Intent intent = new Intent(Step12Ans.this, Step12Wrong.class);
                    Step12Ans.this.startActivity(intent);
                    finish();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.miMap:
                Intent settings = new Intent(Step12Ans.this, MainActivity.class);
                Step12Ans.this.startActivity(settings);
                return true;
            case R.id.miProfile:
                Intent profile = new Intent(Step12Ans.this, UserProfile.class);
                Step12Ans.this.startActivity(profile);
                return true;
            case R.id.miAboutUs:
                Intent aboutUs = new Intent(Step12Ans.this, AboutUs.class);
                Step12Ans.this.startActivity(aboutUs);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
