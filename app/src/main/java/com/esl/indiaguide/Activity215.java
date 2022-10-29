package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity215 extends Activity24 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity215);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity219();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity220();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity221();
            }
        });
    }

    private void openActivity219() {
        Intent intent = new Intent(Activity215.this, Activity219.class);
        startActivity(intent);
    }

    private void openActivity220() {
        Intent intent = new Intent(Activity215.this, Activity220.class);
        startActivity(intent);
    }

    private void openActivity221() {
        Intent intent = new Intent(Activity215.this, Activity221.class);
        startActivity(intent);
    }
}

