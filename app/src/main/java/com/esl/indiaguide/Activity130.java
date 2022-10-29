package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity130 extends Activity13 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity130);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity137();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity138();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity139();
            }
        });
    }

    private void openActivity137() {
        Intent intent = new Intent(Activity130.this, Activity137.class);
        startActivity(intent);
    }

    private void openActivity138() {
        Intent intent = new Intent(Activity130.this, Activity138.class);
        startActivity(intent);
    }

    private void openActivity139() {
        Intent intent = new Intent(Activity130.this, Activity139.class);
        startActivity(intent);
    }
}

