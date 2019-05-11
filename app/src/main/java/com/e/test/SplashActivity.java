package com.e.test;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


public class SplashActivity extends AppCompatActivity {
    MediaPlayer m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {

            requestWindowFeature(Window.FEATURE_NO_TITLE);                                      //makes and activity full screen or removes the title bar
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);           //Hiding the status bar


            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            //creating thread that will sleep for 10 seconds
            Thread t = new Thread() {
                public void run() {
                    try {
                        //sleep thread for 10 seconds, time in milliseconds


                        sleep(3000);
                        //start new activity
                        Intent i = new Intent(SplashActivity.this, MainActivity.class);
                        startActivity(i);

                        //destroying Splash activity
                        finish();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            //start thread
            t.start();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}