package com.cioc.amit.hero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by amit on 31/5/18.
 */

public class Question1 extends Activity {
ImageButton imageButton;
RadioButton option1,option2;
TextView textView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_question1);

            textView = (TextView) findViewById(R.id.question1);
            option1 = (RadioButton) findViewById(R.id.quiz1option1);
            option2 = (RadioButton) findViewById(R.id.quiz1option2);

            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
            imageButton = (ImageButton) findViewById(R.id.button1);
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Question1.this,Question2.class);
                    startActivity(intent);
                }
            });
        }
}

