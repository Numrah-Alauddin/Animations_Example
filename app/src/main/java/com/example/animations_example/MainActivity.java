package com.example.animations_example;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {

    Button test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test=findViewById(R.id.test);

        Handler handler=new Handler();

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                test.setVisibility(View.VISIBLE);

                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        };

          handler.postDelayed(runnable,4000);


    }
}
