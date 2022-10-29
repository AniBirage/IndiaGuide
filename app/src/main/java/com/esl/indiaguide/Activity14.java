package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity14 extends AppCompatActivity {


    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity14);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity140();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity141();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity142();
            }
        });
    }

    private void openActivity140() {
        Intent intent = new Intent(Activity14.this, Activity140.class);
        startActivity(intent);
    }

    private void openActivity141() {
        Intent intent = new Intent(Activity14.this, Activity141.class);
        startActivity(intent);
    }

    private void openActivity142() {
        Intent intent = new Intent(Activity14.this, Activity142.class);
        startActivity(intent);
    }


}
