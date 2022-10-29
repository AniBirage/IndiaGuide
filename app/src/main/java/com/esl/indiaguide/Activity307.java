package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity307 extends Activity35{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity307);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity309();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity310();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity311();
            }
        });
    }

    private void openActivity309() {
        Intent intent = new Intent(Activity307.this, Activity309.class);
        startActivity(intent);
    }

    private void openActivity310() {
        Intent intent = new Intent(Activity307.this, Activity310.class);
        startActivity(intent);
    }

    private void openActivity311() {
        Intent intent = new Intent(Activity307.this, Activity311.class);
        startActivity(intent);
    }
}
