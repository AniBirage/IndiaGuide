package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity197 extends Activity22 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity197);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity203();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity204();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity205();
            }
        });
    }

    private void openActivity203() {
        Intent intent = new Intent(Activity197.this, Activity203.class);
        startActivity(intent);
    }

    private void openActivity204() {
        Intent intent = new Intent(Activity197.this, Activity204.class);
        startActivity(intent);
    }

    private void openActivity205() {
        Intent intent = new Intent(Activity197.this, Activity205.class);
        startActivity(intent);
    }
}

