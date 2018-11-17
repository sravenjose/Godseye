package com.ge.characterrecognition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Splash extends AppCompatActivity implements Runnable {
    Intent i ;
    Thread t ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView tv=(TextView)findViewById(R.id.text) ;
        TextView tv1=(TextView)findViewById(R.id.text1) ;
        t = new Thread(this);
        t.start();

    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }
}