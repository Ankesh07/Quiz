package com.cioc.amit.hero;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by amit on 3/6/18.
 */

public class Popup2 extends Activity {
    EditText e1, e2, e3;
    ImageButton imageButton;
    final Context context = this;

    SharedPreferences preferences;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup2);


        preferences = getSharedPreferences("MyPrefs",MODE_PRIVATE);

        e1 = (EditText) findViewById(R.id.name);
        e2 = (EditText)findViewById(R.id.phone);
        e3 = (EditText) findViewById(R.id.city);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;


        imageButton = (ImageButton) findViewById(R.id.submit);

        // add button listener
           imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String name = e1.getText().toString();
                String phone = e2.getText().toString();
                String address = e3.getText().toString();
                if(name.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Name can't be Empty",Toast.LENGTH_SHORT).show();
                }
                else if(phone.equals("")||phone.length()!=10)
                {
                    Toast.makeText(getApplicationContext(),"Phone No not Valid",Toast.LENGTH_SHORT).show();
                }
                else if(address.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Address can't be Empty",Toast.LENGTH_SHORT).show();
                }
                else {

                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("aName", name);
                    editor.putString("aPhone", phone);
                    editor.putString("aAddress", address);

                    editor.commit();


                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                            context);

                    // set dialog message
                    alertDialogBuilder
                            .setMessage("Congratulations!")
                            .setCancelable(false)
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                    Intent intent = new Intent(Popup2.this,MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();

                    // show it
                    alertDialog.show();
                }}
        });
    }
    public void onBackPressed() {
        // super.onBackPressed(); commented this line in order to disable back press
        Toast.makeText(getApplicationContext(), "Back press disabled!", Toast.LENGTH_SHORT).show();
    }
}
