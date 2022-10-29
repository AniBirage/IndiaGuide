package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity154 extends Activity15{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity154);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity161();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity162();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity163();
            }
        });
    }

    private void openActivity161() {
        Intent intent = new Intent(Activity154.this, Activity161.class);
        startActivity(intent);
    }

    private void openActivity162() {
        Intent intent = new Intent(Activity154.this, Activity162.class);
        startActivity(intent);
    }

    private void openActivity163() {
        Intent intent = new Intent(Activity154.this, Activity163.class);
        startActivity(intent);
    }

}
