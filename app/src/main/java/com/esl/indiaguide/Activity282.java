package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity282 extends Activity30 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity282);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity284();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity285();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity286();
            }
        });
    }

    private void openActivity284() {
        Intent intent = new Intent(Activity282.this, Activity284.class);
        startActivity(intent);
    }

    private void openActivity285() {
        Intent intent = new Intent(Activity282.this, Activity285.class);
        startActivity(intent);
    }

    private void openActivity286() {
        Intent intent = new Intent(Activity282.this, Activity286.class);
        startActivity(intent);
    }
}

