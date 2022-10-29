package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity142 extends Activity14 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity142);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity149();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity150();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity151();
            }
        });
    }

    private void openActivity149() {
        Intent intent = new Intent(Activity142.this, Activity149.class);
        startActivity(intent);
    }

    private void openActivity150() {
        Intent intent = new Intent(Activity142.this, Activity150.class);
        startActivity(intent);
    }

    private void openActivity151() {
        Intent intent = new Intent(Activity142.this, Activity151.class);
        startActivity(intent);
    }
}

