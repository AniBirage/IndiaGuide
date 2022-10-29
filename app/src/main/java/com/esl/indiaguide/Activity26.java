package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity26 extends AppCompatActivity {


    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity26);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity239();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity240();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity241();
            }
        });
    }

    private void openActivity239() {
        Intent intent = new Intent(Activity26.this, Activity239.class);
        startActivity(intent);
    }

    private void openActivity240() {
        Intent intent = new Intent(Activity26.this, Activity240.class);
        startActivity(intent);
    }

    private void openActivity241() {
        Intent intent = new Intent(Activity26.this, Activity241.class);
        startActivity(intent);
    }


}
