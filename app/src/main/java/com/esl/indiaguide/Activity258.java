package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity258 extends Activity28{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity258);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity262();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity263();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity264();
            }
        });
    }

    private void openActivity262() {
        Intent intent = new Intent(Activity258.this, Activity262.class);
        startActivity(intent);
    }

    private void openActivity263() {
        Intent intent = new Intent(Activity258.this, Activity263.class);
        startActivity(intent);
    }

    private void openActivity264() {
        Intent intent = new Intent(Activity258.this, Activity264.class);
        startActivity(intent);
    }
}
