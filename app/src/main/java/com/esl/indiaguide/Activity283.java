package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity283 extends Activity30 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity283);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity287();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity288();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity289();
            }
        });
    }

    private void openActivity287() {
        Intent intent = new Intent(Activity283.this, Activity287.class);
        startActivity(intent);
    }

    private void openActivity288() {
        Intent intent = new Intent(Activity283.this, Activity288.class);
        startActivity(intent);
    }

    private void openActivity289() {
        Intent intent = new Intent(Activity283.this, Activity289.class);
        startActivity(intent);
    }
}

