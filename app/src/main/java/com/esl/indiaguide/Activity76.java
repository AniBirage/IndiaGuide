package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity76 extends Activity8{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity76);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity80();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity81();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity82();
            }
        });

    }

    private void openActivity80() {
        Intent intent = new Intent(Activity76.this, Activity80.class);
        startActivity(intent);
    }

    private void openActivity81() {
        Intent intent = new Intent(Activity76.this, Activity81.class);
        startActivity(intent);
    }

    private void openActivity82() {
        Intent intent = new Intent(Activity76.this, Activity82.class);
        startActivity(intent);
    }


}

