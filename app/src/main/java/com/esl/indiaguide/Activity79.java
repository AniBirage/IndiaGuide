package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity79 extends Activity8{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity79);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity89();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity90();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity91();
            }
        });

    }

    private void openActivity89() {
        Intent intent = new Intent(Activity79.this, Activity89.class);
        startActivity(intent);
    }

    private void openActivity90() {
        Intent intent = new Intent(Activity79.this, Activity90.class);
        startActivity(intent);
    }

    private void openActivity91() {
        Intent intent = new Intent(Activity79.this, Activity91.class);
        startActivity(intent);
    }


}

