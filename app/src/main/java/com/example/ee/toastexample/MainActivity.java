package com.example.ee.toastexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
    }
    public void clickable(View v){
        LayoutInflater inflate = getLayoutInflater();
        View layout = inflate.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast_container));

        Toast tost = new Toast(getApplicationContext());
        tost.setGravity(Gravity.CLIP_HORIZONTAL,0,-50);
        tost.setDuration(Toast.LENGTH_LONG);
        tost.setView(layout);
        tost.show();
    }
}
