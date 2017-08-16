package com.enotik.a21steps;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {

    TextView nameTV, usernameTV, ageTV, userScore;
    Button logOut;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }

        SharedPreferences userInfo = getSharedPreferences("USER_INFO", Context.MODE_PRIVATE);
        username = userInfo.getString("username", null);

        userScore = (TextView) findViewById(R.id.userScore);
        nameTV = (TextView) findViewById(R.id.name);
        usernameTV = (TextView) findViewById(R.id.username);
        ageTV = (TextView) findViewById(R.id.age);

        logOut = (Button) findViewById(R.id.logOut);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(UserProfile.this,
                        R.style.AlertDialogCustom);
                builder.setTitle("Потвердите действие")
                        .setMessage("Вы уверены, что хотите выйти?")
                        .setIcon(R.drawable.ic_warning_white_24dp)
                        .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent logout = new Intent(UserProfile.this, MainActivity.class);
                                logout.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                logout.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                UserProfile.this.startActivity(logout);

                                SharedPreferences userInfo = getSharedPreferences("USER_INFO", Context.MODE_PRIVATE);
                                SharedPreferences.Editor editor = userInfo.edit();
                                editor.clear();
                                editor.commit();

                                finish();
                            }
                        })
                        .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // do nothing
                            }
                        })
                        .create()
                        .show();
            }
        });

        displayInfo();
        setUserScore();
    }

    private void setUserScore() {

        SharedPreferences[] shPr = new SharedPreferences[21];
        for(int i = 0; i < 21; i++){
            shPr[i] = getSharedPreferences("Activity" + (i+1) + username, Context.MODE_PRIVATE);
            int current = Integer.parseInt(userScore.getText().toString());
            int score = shPr[i].getInt("Progress", 0);
            userScore.setText(current + score + "");
        }
    }

    public void displayInfo(){

        SharedPreferences userInfo = getSharedPreferences("USER_INFO", Context.MODE_PRIVATE);
        String name = userInfo.getString("name", "");
        String username = userInfo.getString("username", "");
        int age = userInfo.getInt("age", 0);
        nameTV.setText("  " + name);
        usernameTV.setText("  " + username);
        ageTV.setText("  " + age);
    }
}
