package com.example.carloslopez.threepassages;

import android.content.Intent;
//import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton buttonFlick;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_acitivity);

//        buttonFlick.setId(R.id.imageButton);
//        buttonFlick.setImageResource(R.drawable.creedbreakdown);
//
//        buttonFlick.setId(R.id.imageButton2);
//        buttonFlick.setImageResource(R.drawable.milliondollar3);
//
//        buttonFlick.setId(R.id.imageButton3);
//        buttonFlick.setImageResource(R.drawable.southpaw);

    }

    public void creed(View v) {
        intent = new Intent(this, creedActivity.class);
        buttonFlick = (ImageButton) findViewById(R.id.imageButton);
        startActivity(intent);
    }

    public void millionDollar(View v) {
        intent = new Intent(this, millionDollarBabyActivity.class);
        buttonFlick = (ImageButton) findViewById(R.id.imageButton2);
        startActivity(intent);

    }
    public void southPaw(View v){
        intent = new Intent(this, southPaw.class);
        buttonFlick = (ImageButton) findViewById(R.id.imageButton3);
        startActivity(intent);
    }


}





