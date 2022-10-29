package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity232 extends Activity25{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity232);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity236();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity237();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity238();
            }
        });
    }

    private void openActivity236() {
        Intent intent = new Intent(Activity232.this, Activity236.class);
        startActivity(intent);
    }

    private void openActivity237() {
        Intent intent = new Intent(Activity232.this, Activity237.class);
        startActivity(intent);
    }

    private void openActivity238() {
        Intent intent = new Intent(Activity232.this, Activity238.class);
        startActivity(intent);
    }
}
