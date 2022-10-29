package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity152 extends Activity15{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity152);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity155();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity156();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity157();
            }
        });
    }

    private void openActivity155() {
        Intent intent = new Intent(Activity152.this, Activity155.class);
        startActivity(intent);
    }

    private void openActivity156() {
        Intent intent = new Intent(Activity152.this, Activity156.class);
        startActivity(intent);
    }

    private void openActivity157() {
        Intent intent = new Intent(Activity152.this, Activity157.class);
        startActivity(intent);
    }

}
