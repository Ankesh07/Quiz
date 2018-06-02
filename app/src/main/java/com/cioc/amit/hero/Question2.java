package com.cioc.amit.hero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Question2 extends Activity {
    ImageButton imageButton;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        imageButton = (ImageButton) findViewById(R.id.button2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Question2.this,Question3.class);
                startActivity(intent);
            }
        });
    }
}
