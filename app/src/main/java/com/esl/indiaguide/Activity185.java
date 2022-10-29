package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity185 extends Activity21 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity185);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity190();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity191();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity192();
            }
        });
    }

    private void openActivity190() {
        Intent intent = new Intent(Activity185.this, Activity190.class);
        startActivity(intent);
    }

    private void openActivity191() {
        Intent intent = new Intent(Activity185.this, Activity191.class);
        startActivity(intent);
    }

    private void openActivity192() {
        Intent intent = new Intent(Activity185.this, Activity192.class);
        startActivity(intent);
    }
}

