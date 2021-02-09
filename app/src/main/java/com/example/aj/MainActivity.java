package com.example.aj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mylib.MyLibUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLibUtils.say();
    }
}