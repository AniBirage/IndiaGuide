package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity184 extends Activity21 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity184);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity187();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity188();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity189();
            }
        });
    }

    private void openActivity187() {
        Intent intent = new Intent(Activity184.this, Activity187.class);
        startActivity(intent);
    }

    private void openActivity188() {
        Intent intent = new Intent(Activity184.this, Activity188.class);
        startActivity(intent);
    }

    private void openActivity189() {
        Intent intent = new Intent(Activity184.this, Activity189.class);
        startActivity(intent);
    }
}

