package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity8 extends AppCompatActivity {


    private Button button, button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity8);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity76();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity77();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity78();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity79();
            }
        });
    }

    private void openActivity76() {
        Intent intent = new Intent(Activity8.this, Activity76.class);
        startActivity(intent);
    }

    private void openActivity77() {
        Intent intent = new Intent(Activity8.this, Activity77.class);
        startActivity(intent);
    }

    private void openActivity78() {
        Intent intent = new Intent(Activity8.this, Activity78.class);
        startActivity(intent);
    }

    private void openActivity79() {
        Intent intent = new Intent(Activity8.this, Activity79.class);
        startActivity(intent);
    }


}
