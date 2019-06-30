package com.example.carloslopez.threepassages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class creedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creed);

        setTitle("Creed");
        Intent intent = getIntent();
        intent.getExtras();
    }

    public void buttonPush(View v){
        Intent intent = new Intent(this, MainActivity.class);
        Button push = (Button)findViewById(R.id.button2);
        startActivity(intent);

    }

}
