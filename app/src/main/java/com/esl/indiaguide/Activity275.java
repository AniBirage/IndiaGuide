package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity275 extends Activity29 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity275);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity279();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity280();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity281();
            }
        });
    }

    private void openActivity279() {
        Intent intent = new Intent(Activity275.this, Activity279.class);
        startActivity(intent);
    }

    private void openActivity280() {
        Intent intent = new Intent(Activity275.this, Activity280.class);
        startActivity(intent);
    }

    private void openActivity281() {
        Intent intent = new Intent(Activity275.this, Activity281.class);
        startActivity(intent);
    }
}

