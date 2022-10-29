package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity231 extends Activity25{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity231);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity233();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity234();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity235();
            }
        });
    }

    private void openActivity233() {
        Intent intent = new Intent(Activity231.this, Activity233.class);
        startActivity(intent);
    }

    private void openActivity234() {
        Intent intent = new Intent(Activity231.this, Activity234.class);
        startActivity(intent);
    }

    private void openActivity235() {
        Intent intent = new Intent(Activity231.this, Activity235.class);
        startActivity(intent);
    }
}
