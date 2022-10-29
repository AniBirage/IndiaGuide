package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity177 extends Activity20 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity177);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity181();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity182();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity183();
            }
        });
    }

    private void openActivity181() {
        Intent intent = new Intent(Activity177.this, Activity181.class);
        startActivity(intent);
    }

    private void openActivity182() {
        Intent intent = new Intent(Activity177.this, Activity182.class);
        startActivity(intent);
    }

    private void openActivity183() {
        Intent intent = new Intent(Activity177.this, Activity183.class);
        startActivity(intent);
    }
}

