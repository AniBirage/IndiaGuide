package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity93 extends Activity9 {
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity92);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity97();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity98();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity99();
            }
        });
    }

    private void openActivity97() {
        Intent intent = new Intent(Activity93.this, Activity97.class);
        startActivity(intent);
    }

    private void openActivity98() {
        Intent intent = new Intent(Activity93.this, Activity98.class);
        startActivity(intent);
    }

    private void openActivity99() {
        Intent intent = new Intent(Activity93.this, Activity99.class);
        startActivity(intent);
    }


}
