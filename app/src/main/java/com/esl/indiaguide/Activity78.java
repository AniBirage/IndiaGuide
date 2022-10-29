package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity78 extends Activity8{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity78);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity86();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity87();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity88();
            }
        });

    }

    private void openActivity86() {
        Intent intent = new Intent(Activity78.this, Activity86.class);
        startActivity(intent);
    }

    private void openActivity87() {
        Intent intent = new Intent(Activity78.this, Activity87.class);
        startActivity(intent);
    }

    private void openActivity88() {
        Intent intent = new Intent(Activity78.this, Activity88.class);
        startActivity(intent);
    }


}

