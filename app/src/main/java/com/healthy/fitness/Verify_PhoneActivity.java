package com.healthy.fitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Verify_PhoneActivity extends AppCompatActivity {

    CardView card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_phone);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        card = findViewById(R.id.login);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Verify_PhoneActivity.this,MainActivity.class));
            }
        });
    }
}