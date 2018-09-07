package com.example.user.posprima.MenuAwal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.user.posprima.R;

public class splashScreen extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageView = (ImageView) findViewById(R.id.imageView);
        Animation myAnimasi = AnimationUtils.loadAnimation(this,R.anim.transisi);
        imageView.startAnimation(myAnimasi);
        Thread SplashKu = new Thread(){
            @Override
            public void run(){
                try{
                    sleep(4000);
                    Intent i = new Intent(getApplicationContext(), Welcome_Screen.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        SplashKu.start();
    }
}
