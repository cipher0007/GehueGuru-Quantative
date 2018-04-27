package com.cipher0007.yash.gehueguruquant;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class Splash extends AppCompatActivity {

    MediaPlayer welc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        Thread timer=new Thread(){
            public void run(){
                try{

                    sleep(3000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally{

                    Intent i=new Intent(Splash.this, MainActivity.class);
                    startActivity(i);


                }
            }
        };
        timer.start();
    }
protected void onPause(){
    super.onPause();

    this.finish();
}
}
