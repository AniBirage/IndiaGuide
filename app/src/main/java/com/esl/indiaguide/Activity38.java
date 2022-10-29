package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity38 extends Activity2{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity38);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity40();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity41();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity42();
            }
        });
    }

    private void openActivity40() {
        Intent intent = new Intent(Activity38.this, Activity40.class);
        startActivity(intent);
    }

    private void openActivity41() {
        Intent intent = new Intent(Activity38.this, Activity41.class);
        startActivity(intent);
    }

    private void openActivity42() {
        Intent intent = new Intent(Activity38.this, Activity42.class);
        startActivity(intent);
    }


}

