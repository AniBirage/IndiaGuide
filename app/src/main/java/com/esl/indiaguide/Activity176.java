package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity176 extends Activity20 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity176);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity178();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity179();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity180();
            }
        });
    }

    private void openActivity178() {
        Intent intent = new Intent(Activity176.this, Activity178.class);
        startActivity(intent);
    }

    private void openActivity179() {
        Intent intent = new Intent(Activity176.this, Activity179.class);
        startActivity(intent);
    }

    private void openActivity180() {
        Intent intent = new Intent(Activity176.this, Activity180.class);
        startActivity(intent);
    }
}

