package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity18 extends AppCompatActivity {

    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity18);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity170();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity171();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity172();
            }
        });
    }

    private void openActivity170() {
        Intent intent = new Intent(Activity18.this, Activity170.class);
        startActivity(intent);
    }

    private void openActivity171() {
        Intent intent = new Intent(Activity18.this, Activity171.class);
        startActivity(intent);
    }

    private void openActivity172() {
        Intent intent = new Intent(Activity18.this, Activity172.class);
        startActivity(intent);
    }
}
