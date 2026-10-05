package com.example.hi;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");

        TextView textEmail = findViewById(R.id.emailText);
        TextView textPassword = findViewById(R.id.passwordText);

        textEmail.setText(email);
        textPassword.setText(password);
    }
}