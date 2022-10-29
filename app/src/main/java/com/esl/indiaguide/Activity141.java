package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity141 extends Activity14 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity141);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity146();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity147();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity148();
            }
        });
    }

    private void openActivity146() {
        Intent intent = new Intent(Activity141.this, Activity146.class);
        startActivity(intent);
    }

    private void openActivity147() {
        Intent intent = new Intent(Activity141.this, Activity147.class);
        startActivity(intent);
    }

    private void openActivity148() {
        Intent intent = new Intent(Activity141.this, Activity148.class);
        startActivity(intent);
    }
}

