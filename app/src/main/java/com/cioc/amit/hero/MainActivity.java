package com.cioc.amit.hero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import at.markushi.ui.CircleButton;

public class MainActivity extends Activity {
    CircleButton button1;
    CircleButton button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (CircleButton) findViewById(R.id.quiz);
        button2 = (CircleButton) findViewById(R.id.puzzle);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Quiz.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Puzzle.class);
                startActivity(i);
            }
        });
    }
}
