package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity16 extends AppCompatActivity {

    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity16);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity164();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity165();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity166();
            }
        });
    }

    private void openActivity164() {
        Intent intent = new Intent(Activity16.this, Activity164.class);
        startActivity(intent);
    }

    private void openActivity165() {
        Intent intent = new Intent(Activity16.this, Activity165.class);
        startActivity(intent);
    }

    private void openActivity166() {
        Intent intent = new Intent(Activity16.this, Activity166.class);
        startActivity(intent);
    }
}
