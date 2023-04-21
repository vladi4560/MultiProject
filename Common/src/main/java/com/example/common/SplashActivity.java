package com.example.common;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;


public class SplashActivity extends AppCompatActivity {


    private LottieAnimationView animation;
    final int ANIM_DURATION = 6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        animation= findViewById(R.id.splash_lottie);

        //animation.animate().translationX(2000).setDuration(2000).setStartDelay(1000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                statsClicked();
            }
        },ANIM_DURATION);

    }

    private void statsClicked() {
       startActivity(new Intent(this, App_Parent.reviewClass));
       finish();
    }

}
