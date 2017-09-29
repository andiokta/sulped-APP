package com.example.amikom.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

     String msg ="-- amikom app :";

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(msg, "The onCreated() event");
    }

    @Override
    protected void onStart () {
        super.onStart();
        Log.d(msg, "onStart () event");
    }

    @Override
    protected void onPause () {
        super.onPause();
        Log.d(msg, "onPause () event");
    }

    @Override
    protected void onStop () {
        super.onStop();
        Log.d(msg, "onStop () event");
    }

    @Override
    protected void onRestart () {
        super.onRestart();
        Log.d(msg, "onRestart () event");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.d(msg, "onDestroy () event");
    }
}
