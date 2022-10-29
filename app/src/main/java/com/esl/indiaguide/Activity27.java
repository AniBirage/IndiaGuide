package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity27 extends AppCompatActivity {


    private Button button, button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity27);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity242();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity243();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity244();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity245();
            }
        });
    }

    private void openActivity242() {
        Intent intent = new Intent(Activity27.this, Activity242.class);
        startActivity(intent);
    }

    private void openActivity243() {
        Intent intent = new Intent(Activity27.this, Activity243.class);
        startActivity(intent);
    }

    private void openActivity244() {
        Intent intent = new Intent(Activity27.this, Activity244.class);
        startActivity(intent);
    }

    private void openActivity245() {
        Intent intent = new Intent(Activity27.this, Activity245.class);
        startActivity(intent);
    }


}
