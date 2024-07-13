package com.example.abdulraheman.quizbee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.abdulraheman.quizbee.R;


public class DeveloperActivity extends AppCompatActivity {
    private Button backApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

        backApplication = (Button) findViewById(R.id.button4);


        backApplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeveloperActivity.this.finish();
                System.exit(0);
            }
        });
    }
}
