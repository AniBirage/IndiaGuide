package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity68 extends Activity7{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity68);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity70();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity71();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity72();
            }
        });
    }

    private void openActivity70() {
        Intent intent = new Intent(Activity68.this, Activity70.class);
        startActivity(intent);
    }

    private void openActivity71() {
        Intent intent = new Intent(Activity68.this, Activity71.class);
        startActivity(intent);
    }

    private void openActivity72() {
        Intent intent = new Intent(Activity68.this, Activity72.class);
        startActivity(intent);
    }


}

