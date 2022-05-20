package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread th=new Thread(){
          public void run()
          {
              try
              {
                  sleep(4000);
              }
              catch(Exception e)
              {
                  e.printStackTrace();
              }
              finally {
                  Intent i=new Intent(Splash_Activity.this, MainActivity.class);
                  startActivity(i);
              }
          }
        };th.start();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
}