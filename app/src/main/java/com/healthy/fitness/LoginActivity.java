package com.healthy.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    TextView forget_password,sign_up;
    MaterialButton login;
    EditText email,password;
    ImageView eye;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bindings();
        click();

    }



    private void bindings() {

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        eye = findViewById(R.id.show_password);
        forget_password = findViewById(R.id.forget_password);
        sign_up = findViewById(R.id.sign_up);
        login = findViewById(R.id.login);
    }

    private void click() {
        preferences = getSharedPreferences("Login", 0);
        editor = preferences.edit();

        eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(LoginActivity.this, "Show_Password", Toast.LENGTH_SHORT).show();
            }
        });

        if (!preferences.getString("email", "").matches("") && !preferences.getString("password", "").matches("")) {

            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                editor.putString("email",email.getText().toString());
                editor.putString("password",password.getText().toString());
                editor.commit();

                String Email  = preferences.getString("email","");
                String Password  = preferences.getString("password","");

                if (!Email.isEmpty() && !Password.isEmpty()){


                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                    finish();


                }
                else{
                    Toast.makeText(LoginActivity.this, "Email and Password is Empty", Toast.LENGTH_SHORT).show();

                }
            }
        });
        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(LoginActivity.this,Forget_passwordActivity.class));

            }
        });
        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(LoginActivity.this,SignupActivity.class));
            }
        });
    }
}