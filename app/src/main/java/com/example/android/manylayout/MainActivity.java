package com.example.android.manylayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void number(View v){
        Intent intent = new Intent(this, Contact.class);
        startActivity(intent);
    }

    public void family(View v){
        Intent intent = new Intent(this, Family.class);
        startActivity(intent);
    }
    public void color(View v){
        Intent intent = new Intent(this, Color.class);
        startActivity(intent);
    }
    public void place(View v){
        Intent intent = new Intent(this, Place.class);
        startActivity(intent);
    }
}
