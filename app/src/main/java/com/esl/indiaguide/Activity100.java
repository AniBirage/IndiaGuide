package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity100 extends Activity10 {
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity100);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity102();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity103();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity104();
            }
        });
    }

    private void openActivity102() {
        Intent intent = new Intent(Activity100.this, Activity102.class);
        startActivity(intent);
    }

    private void openActivity103() {
        Intent intent = new Intent(Activity100.this, Activity103.class);
        startActivity(intent);
    }

    private void openActivity104() {
        Intent intent = new Intent(Activity100.this, Activity104.class);
        startActivity(intent);
    }


}
