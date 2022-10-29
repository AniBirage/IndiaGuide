package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity244 extends Activity27 {
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity244);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity252();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity253();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity254();
            }
        });
    }

    private void openActivity252() {
        Intent intent = new Intent(Activity244.this, Activity252.class);
        startActivity(intent);
    }

    private void openActivity253() {
        Intent intent = new Intent(Activity244.this, Activity253.class);
        startActivity(intent);
    }

    private void openActivity254() {
        Intent intent = new Intent(Activity244.this, Activity254.class);
        startActivity(intent);
    }
}
