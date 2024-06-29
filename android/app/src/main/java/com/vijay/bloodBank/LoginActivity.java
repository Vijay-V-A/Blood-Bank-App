package com.vijay.bloodBank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signUp(View view) {
        startActivity(new Intent(LoginActivity.this, SignupActivity.class));
    }

    public void mainLoad(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    public void login(View view) {
        email = findViewById(R.id.email_address);
        password = findViewById(R.id.password);

//        if (!email.getText().toString().equals("va0459@srmist.edu.in")) {
//            Toast.makeText(LoginActivity.this, "Email Id is Incorrect", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
//        if (!password.getText().toString().equals("12345")) {
//            Toast.makeText(LoginActivity.this, "Password is Incorrect", Toast.LENGTH_SHORT).show();
//            return;
//        }

        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}