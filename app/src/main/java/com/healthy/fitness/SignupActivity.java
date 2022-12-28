package com.healthy.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButton;

public class SignupActivity extends AppCompatActivity {

    MaterialButton login;
    ImageView arrow_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bindings();
        click();
    }
    private void bindings() {

        login = findViewById(R.id.login);
        arrow_back = findViewById(R.id.arrow_back);
    }

    private void click() {

        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(SignupActivity.this,Verify_PhoneActivity.class));

            }
        });
    }
}