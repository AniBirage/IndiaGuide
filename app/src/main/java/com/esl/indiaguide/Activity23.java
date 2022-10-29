package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity23 extends AppCompatActivity {

    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity23);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity212();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity213();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity214();
            }
        });
    }

    private void openActivity212() {
        Intent intent = new Intent(Activity23.this, Activity212.class);
        startActivity(intent);
    }

    private void openActivity213() {
        Intent intent = new Intent(Activity23.this, Activity213.class);
        startActivity(intent);
    }

    private void openActivity214() {
        Intent intent = new Intent(Activity23.this, Activity214.class);
        startActivity(intent);
    }
}
