package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity242 extends Activity27 {
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity242);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity246();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity247();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity248();
            }
        });
    }

    private void openActivity246() {
        Intent intent = new Intent(Activity242.this, Activity246.class);
        startActivity(intent);
    }

    private void openActivity247() {
        Intent intent = new Intent(Activity242.this, Activity247.class);
        startActivity(intent);
    }

    private void openActivity248() {
        Intent intent = new Intent(Activity242.this, Activity248.class);
        startActivity(intent);
    }
}
