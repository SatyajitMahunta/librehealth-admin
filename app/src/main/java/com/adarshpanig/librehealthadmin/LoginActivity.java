package com.adarshpanig.librehealthadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void gotoDashBoard(View view) {
        Intent intent = new Intent(LoginActivity.this,DashBoard.class);
        startActivity(intent);
    }
}
