package com.cioc.amit.hero;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.jar.Attributes;

/**
 * Created by amit on 3/6/18.
 */

public class Popup extends Activity {
EditText e1,e2,e3;
RadioButton r1,r2,r3;
ImageButton imageButton1;
SharedPreferences preferences;
SharedPreferences.Editor editor;
public String Name,Phone,Address;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup);

      preferences = getSharedPreferences("MyPrefs",MODE_PRIVATE);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        imageButton1 = (ImageButton) findViewById(R.id.Next);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Popup.this, Question4.class);
                startActivity(intent);
            }
        });


//        imageButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String personName = preferences.getString("Name",null);
//                String personePhone = preferences.getString("Phone",null);
//                String personeAddress = preferences.getString("Address",null);
//                String s = "Name -"+personName+"\n"+"Phone - "+personePhone+"\n"+"Address -"+personeAddress;
//                tv
//
//            }
//        });
    }
    public void btClick(View view){
        String name = e1.getText().toString();
        String phone = e2.getText().toString();
        String address = e3.getText().toString();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(Name,name);
        editor.putString(Phone,phone);
        editor.putString(Address,address);
        editor.commit();
        Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_SHORT).show();
    }
}
