package com.example.animations_example;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Drawable_Animations extends AppCompatActivity {
    ImageView img;
    AnimationDrawable animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable__animations);

        img=findViewById(R.id.image1);

        animation=new AnimationDrawable();
        animation= (AnimationDrawable) img.getBackground();
        animation.start();
        animation.setOneShot(true);

        Handler handler=new Handler();

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
              animation.stop();
              startActivity(new Intent(Drawable_Animations.this,SecondActivity.class));
            }
        };

        handler.postDelayed(runnable,4000);

    }
}
