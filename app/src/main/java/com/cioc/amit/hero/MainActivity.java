package com.cioc.amit.hero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import at.markushi.ui.CircleButton;

public class MainActivity extends Activity {
    CircleButton button1;
    CircleButton button2;
    CircleButton button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (CircleButton) findViewById(R.id.quiz);
        button2 = (CircleButton) findViewById(R.id.puzzle);
        button3 = (CircleButton) findViewById(R.id.record);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Question1.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,PuzzleGroup.class);
                startActivity(i);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ScrollingActivity.class);
                startActivity(i);
            }
        });
    }
}
