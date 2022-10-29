package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity316 extends Activity36{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity316);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity320();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity321();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity322();
            }
        });
    }

    private void openActivity320() {
        Intent intent = new Intent(Activity316.this, Activity320.class);
        startActivity(intent);
    }

    private void openActivity321() {
        Intent intent = new Intent(Activity316.this, Activity321.class);
        startActivity(intent);
    }

    private void openActivity322() {
        Intent intent = new Intent(Activity316.this, Activity322.class);
        startActivity(intent);
    }
}
