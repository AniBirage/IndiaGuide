package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity108 extends Activity11{

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity108);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity111();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity112();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity113();
            }
        });
    }

    private void openActivity111() {
        Intent intent = new Intent(Activity108.this, Activity111.class);
        startActivity(intent);
    }

    private void openActivity112() {
        Intent intent = new Intent(Activity108.this, Activity112.class);
        startActivity(intent);
    }

    private void openActivity113() {
        Intent intent = new Intent(Activity108.this, Activity113.class);
        startActivity(intent);
    }


}
