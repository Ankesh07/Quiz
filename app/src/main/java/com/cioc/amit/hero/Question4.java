package com.cioc.amit.hero;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Question4 extends Activity {
    ImageButton imageButton;
    RadioGroup rg;
     String value ;
    SharedPreferences preferences;

    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        preferences = getSharedPreferences("MyPrefs",MODE_PRIVATE);

        imageButton = (ImageButton) findViewById(R.id.button4);
        rg = (RadioGroup) findViewById(R.id.radioGroup4);
        value =
                ((RadioButton)findViewById(rg.getCheckedRadioButtonId()))
                        .getText().toString();
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                value =
                        ((RadioButton)findViewById(rg.getCheckedRadioButtonId()))
                                .getText().toString();

            }
        });

                imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(value.equals("A. हाँ")) {
                    Intent intent = new Intent(Question4.this, Popup2.class);
                    startActivity(intent);
                    finish();

                }else {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("Congratulations!")
                            .setCancelable(false)
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                    Intent intent = new Intent(Question4.this,MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();
                }
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("add", value);
                editor.putString("aName", "");
                editor.putString("aPhone", "");
                editor.putString("aAddress", "");

                editor.commit();
            }
        });
    }
    public void onBackPressed() {
        // super.onBackPressed(); commented this line in order to disable back press
        Toast.makeText(getApplicationContext(), "Back press disabled!", Toast.LENGTH_SHORT).show();
    }
}
