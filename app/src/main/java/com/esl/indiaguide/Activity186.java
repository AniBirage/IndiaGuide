package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity186 extends Activity21 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity186);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity193();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity194();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity195();
            }
        });
    }

    private void openActivity193() {
        Intent intent = new Intent(Activity186.this, Activity193.class);
        startActivity(intent);
    }

    private void openActivity194() {
        Intent intent = new Intent(Activity186.this, Activity194.class);
        startActivity(intent);
    }

    private void openActivity195() {
        Intent intent = new Intent(Activity186.this, Activity195.class);
        startActivity(intent);
    }
}

