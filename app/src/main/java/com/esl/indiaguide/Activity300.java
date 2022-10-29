package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity300 extends Activity34{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity300);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity304();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity305();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity306();
            }
        });
    }

    private void openActivity304() {
        Intent intent = new Intent(Activity300.this, Activity304.class);
        startActivity(intent);
    }

    private void openActivity305() {
        Intent intent = new Intent(Activity300.this, Activity305.class);
        startActivity(intent);
    }

    private void openActivity306() {
        Intent intent = new Intent(Activity300.this, Activity306.class);
        startActivity(intent);
    }
}
