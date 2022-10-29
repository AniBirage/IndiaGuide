package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity299 extends Activity34{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity299);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity301();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity302();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity303();
            }
        });
    }

    private void openActivity301() {
        Intent intent = new Intent(Activity299.this, Activity301.class);
        startActivity(intent);
    }

    private void openActivity302() {
        Intent intent = new Intent(Activity299.this, Activity302.class);
        startActivity(intent);
    }

    private void openActivity303() {
        Intent intent = new Intent(Activity299.this, Activity303.class);
        startActivity(intent);
    }
}
