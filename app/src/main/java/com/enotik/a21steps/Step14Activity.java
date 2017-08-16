package com.enotik.a21steps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by User on 14.08.2017.
 */

public class Step14Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step14_activity);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonBack:
                Intent intent = new Intent(Step14Activity.this, Step14Info.class);
                Step14Activity.this.startActivity(intent);
                break;
            case R.id.buttonNext:
                Intent intent2 = new Intent(Step14Activity.this, Step14Ans.class);
                Step14Activity.this.startActivity(intent2);
                break;
            default:
                break;
        }
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
                Intent settings = new Intent(Step14Activity.this, MainActivity.class);
                Step14Activity.this.startActivity(settings);
                return true;
            case R.id.miProfile:
                Intent profile = new Intent(Step14Activity.this, UserProfile.class);
                Step14Activity.this.startActivity(profile);
                return true;
            case R.id.miAboutUs:
                Intent aboutUs = new Intent(Step14Activity.this, AboutUs.class);
                Step14Activity.this.startActivity(aboutUs);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
