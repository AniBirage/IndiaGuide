package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity39 extends Activity2{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity39);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity43();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity44();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity45();
            }
        });
    }

    private void openActivity43() {
        Intent intent = new Intent(Activity39.this, Activity43.class);
        startActivity(intent);
    }

    private void openActivity44() {
        Intent intent = new Intent(Activity39.this, Activity44.class);
        startActivity(intent);
    }

    private void openActivity45() {
        Intent intent = new Intent(Activity39.this, Activity45.class);
        startActivity(intent);
    }
}
