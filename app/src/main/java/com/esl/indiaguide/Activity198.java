package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity198 extends Activity22 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity198);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity206();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity207();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity208();
            }
        });
    }

    private void openActivity206() {
        Intent intent = new Intent(Activity198.this, Activity206.class);
        startActivity(intent);
    }

    private void openActivity207() {
        Intent intent = new Intent(Activity198.this, Activity207.class);
        startActivity(intent);
    }

    private void openActivity208() {
        Intent intent = new Intent(Activity198.this, Activity208.class);
        startActivity(intent);
    }
}

