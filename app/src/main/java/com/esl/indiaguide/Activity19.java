package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity19 extends AppCompatActivity {

    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity19);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity173();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity174();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity175();
            }
        });
    }

    private void openActivity173() {
        Intent intent = new Intent(Activity19.this, Activity173.class);
        startActivity(intent);
    }

    private void openActivity174() {
        Intent intent = new Intent(Activity19.this, Activity174.class);
        startActivity(intent);
    }

    private void openActivity175() {
        Intent intent = new Intent(Activity19.this, Activity175.class);
        startActivity(intent);
    }
}
