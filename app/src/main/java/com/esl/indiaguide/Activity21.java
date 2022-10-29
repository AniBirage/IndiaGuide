package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity21 extends AppCompatActivity {

    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity21);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity184();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity185();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity186();
            }
        });
    }

    private void openActivity184() {
        Intent intent = new Intent(Activity21.this, Activity184.class);
        startActivity(intent);
    }

    private void openActivity185() {
        Intent intent = new Intent(Activity21.this, Activity185.class);
        startActivity(intent);
    }

    private void openActivity186() {
        Intent intent = new Intent(Activity21.this, Activity186.class);
        startActivity(intent);
    }
}
