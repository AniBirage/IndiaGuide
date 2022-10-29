package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity308 extends Activity35{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity308);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity312();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity313();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity314();
            }
        });
    }

    private void openActivity312() {
        Intent intent = new Intent(Activity308.this, Activity312.class);
        startActivity(intent);
    }

    private void openActivity313() {
        Intent intent = new Intent(Activity308.this, Activity313.class);
        startActivity(intent);
    }

    private void openActivity314() {
        Intent intent = new Intent(Activity308.this, Activity314.class);
        startActivity(intent);
    }
}
