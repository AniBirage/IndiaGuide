package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity32 extends AppCompatActivity {

    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity32);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity293();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity294();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity295();
            }
        });
    }

    private void openActivity293() {
        Intent intent = new Intent(Activity32.this, Activity293.class);
        startActivity(intent);
    }

    private void openActivity294() {
        Intent intent = new Intent(Activity32.this, Activity294.class);
        startActivity(intent);
    }

    private void openActivity295() {
        Intent intent = new Intent(Activity32.this, Activity295.class);
        startActivity(intent);
    }
}
