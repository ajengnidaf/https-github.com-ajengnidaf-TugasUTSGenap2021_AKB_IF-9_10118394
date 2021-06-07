package com.ajengnidaf.a10118394;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class SplashScreenActivity extends AppCompatActivity {

    private long delayMillis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        View decorView = getWindow().getDecorView();

            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

            if (getSupportActionBar() != null){
                getSupportActionBar().hide();
            }

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(createPackageContext(): SplashScreenActivity.this, MainActivity.class));
                    finish();
                }
            }, delayMillis:2000);
    }
}