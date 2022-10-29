package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity69 extends Activity7{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity69);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity73();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity74();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity75();
            }
        });
    }

    private void openActivity73() {
        Intent intent = new Intent(Activity69.this, Activity73.class);
        startActivity(intent);
    }

    private void openActivity74() {
        Intent intent = new Intent(Activity69.this, Activity74.class);
        startActivity(intent);
    }

    private void openActivity75() {
        Intent intent = new Intent(Activity69.this, Activity75.class);
        startActivity(intent);
    }


}

