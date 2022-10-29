package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity259 extends Activity28{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity259);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity265();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity266();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity267();
            }
        });
    }

    private void openActivity265() {
        Intent intent = new Intent(Activity259.this, Activity265.class);
        startActivity(intent);
    }

    private void openActivity266() {
        Intent intent = new Intent(Activity259.this, Activity266.class);
        startActivity(intent);
    }

    private void openActivity267() {
        Intent intent = new Intent(Activity259.this, Activity267.class);
        startActivity(intent);
    }
}
