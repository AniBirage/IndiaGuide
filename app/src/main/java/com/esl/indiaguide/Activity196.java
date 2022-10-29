package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity196 extends Activity22 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity196);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity200();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity201();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity202();
            }
        });
    }

    private void openActivity200() {
        Intent intent = new Intent(Activity196.this, Activity200.class);
        startActivity(intent);
    }

    private void openActivity201() {
        Intent intent = new Intent(Activity196.this, Activity201.class);
        startActivity(intent);
    }

    private void openActivity202() {
        Intent intent = new Intent(Activity196.this, Activity202.class);
        startActivity(intent);
    }
}

