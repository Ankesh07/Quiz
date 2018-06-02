package com.cioc.amit.hero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by amit on 28/5/18.
 */

public class Quiz extends Activity {
 ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        imageView = (ImageView) findViewById(R.id.playbutton);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz.this,Question1.class);
                startActivity(intent);
            }
        });
    }
}
