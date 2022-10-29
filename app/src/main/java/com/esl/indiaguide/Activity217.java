package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity217 extends Activity24 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity217);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity225();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity226();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity227();
            }
        });
    }

    private void openActivity225() {
        Intent intent = new Intent(Activity217.this, Activity225.class);
        startActivity(intent);
    }

    private void openActivity226() {
        Intent intent = new Intent(Activity217.this, Activity226.class);
        startActivity(intent);
    }

    private void openActivity227() {
        Intent intent = new Intent(Activity217.this, Activity227.class);
        startActivity(intent);
    }
}

