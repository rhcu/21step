package com.enotik.a21steps;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 13.08.2017.
 */

public class Step5Wrong extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step5_result_wrong);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        Button btn = (Button) findViewById(R.id.buttonNextStep);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences userInfo = getSharedPreferences("USER_INFO", Context.MODE_PRIVATE);
                final String username = userInfo.getString("username", null);

                MainActivity.btn6.setEnabled(true);
                SharedPreferences sharedPreferences = getSharedPreferences("Step6" + username, Context.MODE_PRIVATE);
                sharedPreferences.edit().putBoolean("Passed", true).apply();

                Intent intent = new Intent(Step5Wrong.this, Step6Descr.class);
                Step5Wrong.this.startActivity(intent);
                finish();
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
                Intent settings = new Intent(Step5Wrong.this, MainActivity.class);
                Step5Wrong.this.startActivity(settings);
                return true;
            case R.id.miProfile:
                Intent profile = new Intent(Step5Wrong.this, UserProfile.class);
                Step5Wrong.this.startActivity(profile);
                return true;
            case R.id.miAboutUs:
                Intent aboutUs = new Intent(Step5Wrong.this, AboutUs.class);
                Step5Wrong.this.startActivity(aboutUs);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
