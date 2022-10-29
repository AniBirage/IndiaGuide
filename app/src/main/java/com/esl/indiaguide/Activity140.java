package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity140 extends Activity14 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity140);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity143();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity144();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity145();
            }
        });
    }

    private void openActivity143() {
        Intent intent = new Intent(Activity140.this, Activity143.class);
        startActivity(intent);
    }

    private void openActivity144() {
        Intent intent = new Intent(Activity140.this, Activity144.class);
        startActivity(intent);
    }

    private void openActivity145() {
        Intent intent = new Intent(Activity140.this, Activity145.class);
        startActivity(intent);
    }
}

