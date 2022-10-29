package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity274 extends Activity29 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity274);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity276();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity277();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity278();
            }
        });
    }

    private void openActivity276() {
        Intent intent = new Intent(Activity274.this, Activity276.class);
        startActivity(intent);
    }

    private void openActivity277() {
        Intent intent = new Intent(Activity274.this, Activity277.class);
        startActivity(intent);
    }

    private void openActivity278() {
        Intent intent = new Intent(Activity274.this, Activity278.class);
        startActivity(intent);
    }
}

