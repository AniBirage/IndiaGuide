package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity218 extends Activity24 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity218);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity228();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity229();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity230();
            }
        });
    }

    private void openActivity228() {
        Intent intent = new Intent(Activity218.this, Activity228.class);
        startActivity(intent);
    }

    private void openActivity229() {
        Intent intent = new Intent(Activity218.this, Activity229.class);
        startActivity(intent);
    }

    private void openActivity230() {
        Intent intent = new Intent(Activity218.this, Activity230.class);
        startActivity(intent);
    }
}

