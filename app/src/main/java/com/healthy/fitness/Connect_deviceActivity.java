package com.healthy.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Connect_deviceActivity extends AppCompatActivity {

    Button connect;
    ImageView arrow_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_device);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        binding();
        click();
    }

    private void binding() {
        connect =findViewById(R.id.connect);
        arrow_back =findViewById(R.id.arrow_back);
    }

    private void click() {

        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Connect_deviceActivity.this, "Device Connected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}