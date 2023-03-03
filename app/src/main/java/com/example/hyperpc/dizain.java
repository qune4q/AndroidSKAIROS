package com.example.hyperpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dizain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dizain);
    }

    public void goBack(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }

    public void openSiz(View v) {
        Intent intent = new Intent(this, siz.class);
        startActivity(intent);
    }
}