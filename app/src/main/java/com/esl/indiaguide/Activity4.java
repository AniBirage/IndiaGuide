package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {

    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity49();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity50();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity51();
            }
        });
    }

    private void openActivity49() {
        Intent intent = new Intent(Activity4.this, Activity49.class);
        startActivity(intent);
    }

    private void openActivity50() {
        Intent intent = new Intent(Activity4.this, Activity50.class);
        startActivity(intent);
    }

    private void openActivity51() {
        Intent intent = new Intent(Activity4.this, Activity51.class);
        startActivity(intent);
    }
}
