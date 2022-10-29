package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity129 extends Activity13 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity129);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity134();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity135();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity136();
            }
        });
    }

    private void openActivity134() {
        Intent intent = new Intent(Activity129.this, Activity134.class);
        startActivity(intent);
    }

    private void openActivity135() {
        Intent intent = new Intent(Activity129.this, Activity135.class);
        startActivity(intent);
    }

    private void openActivity136() {
        Intent intent = new Intent(Activity129.this, Activity136.class);
        startActivity(intent);
    }
}

