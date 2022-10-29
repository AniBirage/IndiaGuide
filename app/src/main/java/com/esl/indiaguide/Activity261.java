package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity261 extends Activity28 {
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity261);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity271();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity272();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity273();
            }
        });
    }

    private void openActivity271() {
        Intent intent = new Intent(Activity261.this, Activity271.class);
        startActivity(intent);
    }

    private void openActivity272() {
        Intent intent = new Intent(Activity261.this, Activity272.class);
        startActivity(intent);
    }

    private void openActivity273() {
        Intent intent = new Intent(Activity261.this, Activity273.class);
        startActivity(intent);
    }
}
