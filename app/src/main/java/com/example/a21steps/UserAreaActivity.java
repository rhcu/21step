package com.example.a21steps;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences pref = getSharedPreferences("ActivityPREF", Context.MODE_PRIVATE);

        if(pref.getBoolean("activity_executed", false)){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        } else {
            SharedPreferences.Editor ed = pref.edit();
            ed.putBoolean("activity_executed", true);
            ed.apply();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg);
        TextView tvUsername = (TextView) findViewById(R.id.tvUsername);
        TextView tvAge = (TextView) findViewById(R.id.tvAge);
        Button startBtn = (Button) findViewById(R.id.startBtn);

        SharedPreferences userInfo = getSharedPreferences("USER_INFO", Context.MODE_PRIVATE);
        String name = userInfo.getString("name", "");
        int age = userInfo.getInt("age", 0);
        String message = "Имя пользователя: " + name;
        String message1 = "Возраст: " + age;

        tvUsername.setText(message);
        tvAge.setText(message1);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserAreaActivity.this, MainActivity.class);
                UserAreaActivity.this.startActivity(intent);
                finish();
            }
        });

    }
}
