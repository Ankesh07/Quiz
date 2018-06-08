package com.cioc.amit.hero;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

public class ScrollingActivity extends Activity {
    SharedPreferences preferences;
    TextView text1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        setTitle("Hero");
    text1= (TextView) findViewById(R.id.mt1);
        t2= (TextView) findViewById(R.id.mt4);
        t3= (TextView) findViewById(R.id.mt6);
        t4= (TextView) findViewById(R.id.mt8);
        t5= (TextView) findViewById(R.id.mt10);
        t6= (TextView) findViewById(R.id.mt12);
        t7= (TextView) findViewById(R.id.mt14);
        t8= (TextView) findViewById(R.id.mt16);
        t9= (TextView) findViewById(R.id.mt18);
        t10= (TextView) findViewById(R.id.mt20);
        t11= (TextView) findViewById(R.id.mt22);


        preferences = getSharedPreferences("MyPrefs",MODE_PRIVATE);
        String s=preferences.getString("Ride","");
        String s1=preferences.getString("model","");
        String s2=preferences.getString("satisfied","");
        String s3=preferences.getString("Name","");
        String s4=preferences.getString("Phone","");
        String s5=preferences.getString("Address","");
        String s6=preferences.getString("Day","");
        String s7=preferences.getString("add","");
        String s8=preferences.getString("aName","");
        String s9=preferences.getString("aPhone","");
        String s10=preferences.getString("aAddress","");

        text1.setText(s);
        t2.setText(s1);
        t3.setText(s2);
        t4.setText(s3);
        t5.setText(s4);
        t6.setText(s5);
        t7.setText(s6);
        t8.setText(s7);
        t9.setText(s8);
        t10.setText(s9);
        t11.setText(s10);


    }
}
