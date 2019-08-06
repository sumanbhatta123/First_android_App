package com.example.splash_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button login;
    private  Button reg;
    private EditText username;
    private EditText password;

    LinearLayout linear1;
    ImageView imageView;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            linear1.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button)findViewById(R.id.login);
        reg = (Button)findViewById(R.id.register_btn);
        linear1 =(LinearLayout)findViewById(R.id.linear1);
        imageView = (ImageView) findViewById(R.id.image);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        handler.postDelayed(runnable,50000);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Comming Soon Dashboard", Toast.LENGTH_LONG);
                    toast.setMargin(100, 100);
                    toast.show();
            }
        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(i);
                finish();
            }
        });
    }


    }

