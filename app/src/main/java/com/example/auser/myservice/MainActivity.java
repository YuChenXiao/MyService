package com.example.auser.myservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("MainActivity.onStopService");
    }
    public void clickok(View v){
        System.out.println("MainActivity.onStopService");
        Intent intent = new Intent(this,MyService.class);
        MyService.isStop =false;
        startService(intent);
    }
    public void clickend(View v){
        System.out.println("MainActivity.onStopService");
        Intent intent =new Intent(this,MyService.class);
        MyService.isStop=true;
        stopService(intent);
    }
}
