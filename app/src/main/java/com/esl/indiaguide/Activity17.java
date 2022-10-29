package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity17 extends AppCompatActivity {

    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity17);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity167();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity168();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity169();
            }
        });
    }

    private void openActivity167() {
        Intent intent = new Intent(Activity17.this, Activity167.class);
        startActivity(intent);
    }

    private void openActivity168() {
        Intent intent = new Intent(Activity17.this, Activity168.class);
        startActivity(intent);
    }

    private void openActivity169() {
        Intent intent = new Intent(Activity17.this, Activity169.class);
        startActivity(intent);
    }
}
