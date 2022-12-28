package com.healthy.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class ExercisesActivity extends AppCompatActivity {

    ImageView arrow_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        arrow_back = findViewById(R.id.arrow_back);


        arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

    }
}