package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity101 extends Activity10 {
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity101);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity105();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity106();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity107();
            }
        });
    }

    private void openActivity105() {
        Intent intent = new Intent(Activity101.this, Activity105.class);
        startActivity(intent);
    }

    private void openActivity106() {
        Intent intent = new Intent(Activity101.this, Activity106.class);
        startActivity(intent);
    }

    private void openActivity107() {
        Intent intent = new Intent(Activity101.this, Activity107.class);
        startActivity(intent);
    }


}
