package com.example.ee.toastexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickable(View v){
        Toast tost = Toast.makeText(getApplicationContext(),R.string.toast,Toast.LENGTH_LONG);
        tost.show();
    }
}
