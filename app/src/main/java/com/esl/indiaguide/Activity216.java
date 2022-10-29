package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity216 extends Activity24 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity216);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity222();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity223();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity224();
            }
        });
    }

    private void openActivity222() {
        Intent intent = new Intent(Activity216.this, Activity222.class);
        startActivity(intent);
    }

    private void openActivity223() {
        Intent intent = new Intent(Activity216.this, Activity223.class);
        startActivity(intent);
    }

    private void openActivity224() {
        Intent intent = new Intent(Activity216.this, Activity224.class);
        startActivity(intent);
    }
}

