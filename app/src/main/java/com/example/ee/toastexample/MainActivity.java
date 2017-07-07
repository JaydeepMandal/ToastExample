package com.example.ee.toastexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
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
        Toast tost = Toast.makeText(getApplicationContext(),R.string.toast,Toast.LENGTH_LONG);
        tost.setGravity(Gravity.CLIP_HORIZONTAL,0,0);
        tost.show();
    }
}
