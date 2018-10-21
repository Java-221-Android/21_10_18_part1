package com.sheygam.java_221_21_10_18_partr1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MultiActionActivity extends AppCompatActivity {

    private static final String TAG = "MY_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_action);
        Intent intent = getIntent();
        String action = intent.getAction();
        Log.d(TAG, "onCreate: " + action);
    }
}
