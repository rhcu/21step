package com.example.a21steps;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final TextView tvLoginLink = (TextView)findViewById(R.id.textViewAlreadyRegistered);
        tvLoginLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        final EditText etAge = (EditText) findViewById(R.id.ageEditText);
        final EditText etName = (EditText) findViewById(R.id.nameEditText);
        final EditText etUsername = (EditText) findViewById(R.id.editTextNick);
        final EditText etPassword = (EditText) findViewById(R.id.editTextPassword);
        final Button bRegister = (Button) findViewById(R.id.buttonRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etAge.length() == 0 || etName.length() == 0 || etUsername.length() == 0 || etPassword.length() == 0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                    builder.setTitle("Ошибка")
                            .setMessage("Пустые поля запрещены")
                            .setNegativeButton("Попробуйте снова", null)
                            .setIcon(R.drawable.ic_error_white_24dp)
                            .create()
                            .show();
                } else {
                    final String name = etName.getText().toString();
                    final String username = etUsername.getText().toString();
                    final int age = Integer.parseInt(etAge.getText().toString());
                    final String password = etPassword.getText().toString();

                    Response.Listener<String> responseListener = new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONObject jsonResponse = new JSONObject(response);
                                boolean success = jsonResponse.getBoolean("success");
                                if (success) {
                                    SharedPreferences userInfo = getSharedPreferences("USER_INFO", Context.MODE_PRIVATE);
                                    SharedPreferences.Editor editor = userInfo.edit();
                                    editor.putString("name", name);
                                    editor.putInt("age", age);
                                    editor.putString("username", username);
                                    editor.putString("password", password);
                                    editor.apply();

                                    Intent intent = new Intent(RegisterActivity.this, UserAreaActivity.class);
                                    RegisterActivity.this.startActivity(intent);

                                    finish();
                                } else {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                    builder.setTitle("Ошибка")
                                            .setMessage("Регистрация не удалась")
                                            .setNegativeButton("Попробуйте снова", null)
                                            .setIcon(R.drawable.ic_error_white_24dp)
                                            .create()
                                            .show();
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    };

                    RegisterRequest registerRequest = new RegisterRequest(name, username, age, password, responseListener);
                    RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                    queue.add(registerRequest);
                }
            }
        });
    }
}

