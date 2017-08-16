package com.enotik.a21steps;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity{

    static Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10,
            btn11, btn12,btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        SharedPreferences userInfo = getSharedPreferences("USER_INFO", Context.MODE_PRIVATE);
        final String username = userInfo.getString("username", null);

        if(username == null){
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            MainActivity.this.startActivity(intent);
            finish();
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step1Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn2 = (Button) findViewById(R.id.button2);
        SharedPreferences sharedPreferences2 = getSharedPreferences("Step2" + username, Context.MODE_PRIVATE);
        if(sharedPreferences2.getBoolean("Passed", false)){
            btn2.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn2.setEnabled(true);
        }
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step2Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn3 = (Button) findViewById(R.id.button3);
        SharedPreferences sharedPreferences3 = getSharedPreferences("Step3" + username, Context.MODE_PRIVATE);
        if(sharedPreferences3.getBoolean("Passed", false)){
            btn3.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn3.setEnabled(true);
        }
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step3Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn4 = (Button) findViewById(R.id.button4);
        SharedPreferences sharedPreferences4 = getSharedPreferences("Step4" + username, Context.MODE_PRIVATE);
        if(sharedPreferences4.getBoolean("Passed", false)){
            btn4.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn4.setEnabled(true);
        }
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step4Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn5 = (Button) findViewById(R.id.button5);
        SharedPreferences sharedPreferences5 = getSharedPreferences("Step5" + username, Context.MODE_PRIVATE);
        if(sharedPreferences5.getBoolean("Passed", false)){
            btn5.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn5.setEnabled(true);
        }
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step5Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn6 = (Button) findViewById(R.id.button6);
        SharedPreferences sharedPreferences6 = getSharedPreferences("Step6" + username, Context.MODE_PRIVATE);
        if(sharedPreferences6.getBoolean("Passed", false)){
            btn6.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn6.setEnabled(true);
        }
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step6Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn7 = (Button) findViewById(R.id.button7);
        SharedPreferences sharedPreferences7 = getSharedPreferences("Step7" + username, Context.MODE_PRIVATE);
        if(sharedPreferences7.getBoolean("Passed", false)){
            btn7.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn7.setEnabled(true);
        }
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step7Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn8 = (Button) findViewById(R.id.button8);
        SharedPreferences sharedPreferences8 = getSharedPreferences("Step8" + username, Context.MODE_PRIVATE);
        if(sharedPreferences8.getBoolean("Passed", false)){
            btn8.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn8.setEnabled(true);
        }
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step8Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn9 = (Button) findViewById(R.id.button9);
        SharedPreferences sharedPreferences9 = getSharedPreferences("Step9" + username, Context.MODE_PRIVATE);
        if(sharedPreferences9.getBoolean("Passed", false)){
            btn9.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn9.setEnabled(true);
        }
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step9Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn10 = (Button) findViewById(R.id.button10);
        SharedPreferences sharedPreferences10 = getSharedPreferences("Step10" + username, Context.MODE_PRIVATE);
        if(sharedPreferences10.getBoolean("Passed", false)){
            btn10.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn10.setEnabled(true);
        }
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step10Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn11 = (Button) findViewById(R.id.button11);
        SharedPreferences sharedPreferences11 = getSharedPreferences("Step11" + username, Context.MODE_PRIVATE);
        if(sharedPreferences11.getBoolean("Passed", false)){
            btn11.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn11.setEnabled(true);
        }
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step11Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn12 = (Button) findViewById(R.id.button12);
        SharedPreferences sharedPreferences12 = getSharedPreferences("Step12" + username, Context.MODE_PRIVATE);
        if(sharedPreferences12.getBoolean("Passed", false)){
            btn12.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn12.setEnabled(true);
        }
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step12Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn13 = (Button) findViewById(R.id.button13);
        SharedPreferences sharedPreferences13 = getSharedPreferences("Step13" + username, Context.MODE_PRIVATE);
        if(sharedPreferences13.getBoolean("Passed", false)){
            btn13.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn13.setEnabled(true);
        }
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step13Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn14 = (Button) findViewById(R.id.button14);
        SharedPreferences sharedPreferences14 = getSharedPreferences("Step14" + username, Context.MODE_PRIVATE);
        if(sharedPreferences14.getBoolean("Passed", false)){
            btn14.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn14.setEnabled(true);
        }
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, Step14Descr.class);
               MainActivity.this.startActivity(intent);
            }
        });

        btn15 = (Button) findViewById(R.id.button15);
        SharedPreferences sharedPreferences15 = getSharedPreferences("Step15" + username, Context.MODE_PRIVATE);
        if(sharedPreferences15.getBoolean("Passed", false)){
            btn15.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn15.setEnabled(true);
        }
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step15Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn16 = (Button) findViewById(R.id.button16);
        SharedPreferences sharedPreferences16 = getSharedPreferences("Step16" + username, Context.MODE_PRIVATE);
        if(sharedPreferences16.getBoolean("Passed", false)){
            btn16.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn16.setEnabled(true);
        }
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Step16Descr.class);
                MainActivity.this.startActivity(intent);
            }
        });

        btn17 = (Button) findViewById(R.id.button17);
        SharedPreferences sharedPreferences17 = getSharedPreferences("Step17" + username, Context.MODE_PRIVATE);
        if(sharedPreferences17.getBoolean("Passed", false)){
            btn17.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn17.setEnabled(true);
        }
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this, Step17Descr.class);
             MainActivity.this.startActivity(intent);
            }
        });

        btn18 = (Button) findViewById(R.id.button18);
        SharedPreferences sharedPreferences18 = getSharedPreferences("Step18" + username, Context.MODE_PRIVATE);
        if(sharedPreferences18.getBoolean("Passed", false)){
            btn18.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn18.setEnabled(true);
        }
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this, Step18Descr.class);
             MainActivity.this.startActivity(intent);
            }
        });

        btn19 = (Button) findViewById(R.id.button19);
        SharedPreferences sharedPreferences19 = getSharedPreferences("Step19" + username, Context.MODE_PRIVATE);
        if(sharedPreferences19.getBoolean("Passed", false)){
            btn19.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn19.setEnabled(true);
        }
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this, Step19Descr.class);
             MainActivity.this.startActivity(intent);
            }
        });

        btn20 = (Button) findViewById(R.id.button20);
        SharedPreferences sharedPreferences20 = getSharedPreferences("Step20" + username, Context.MODE_PRIVATE);
        if(sharedPreferences20.getBoolean("Passed", false)){
            btn20.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn20.setEnabled(true);
        }
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this, Step20Descr.class);
             MainActivity.this.startActivity(intent);
            }
        });

        btn21 = (Button) findViewById(R.id.button21);
        SharedPreferences sharedPreferences21 = getSharedPreferences("Step21" + username, Context.MODE_PRIVATE);
        if(sharedPreferences21.getBoolean("Passed", false)){
            btn21.setBackgroundTintList(ContextCompat.getColorStateList(MainActivity.this, R.color.titleColor));
            btn21.setEnabled(true);
        }
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(MainActivity.this, Step21Descr.class);
             MainActivity.this.startActivity(intent);
            }
        });

}

    public void onBackPressed() {
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startMain);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.miProfile:
                Intent profile = new Intent(MainActivity.this, UserProfile.class);
                MainActivity.this.startActivity(profile);
                return true;
            case R.id.miAboutUs:
                Intent aboutUs = new Intent(MainActivity.this, AboutUs.class);
                MainActivity.this.startActivity(aboutUs);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
