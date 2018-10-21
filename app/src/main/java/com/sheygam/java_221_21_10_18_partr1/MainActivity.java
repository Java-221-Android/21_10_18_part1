package com.sheygam.java_221_21_10_18_partr1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.first_action_btn)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent("aaaaaAaaaAaaaA"));
                    }
                });
        findViewById(R.id.second_action_btn)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        startActivity(new Intent("java221.211018.second.action"));
                        Intent intent = new Intent("java221.211018.cond.action");
                        Intent chooser = Intent.createChooser(intent,"Choice app!");
                        startActivity(chooser);
                    }
                });

        findViewById(R.id.start_web_btn)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://google.com"));
                        startActivity(intent);
                    }
                });
    }
}
