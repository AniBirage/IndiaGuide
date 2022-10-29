package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity11 extends AppCompatActivity {


    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity11);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity108();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity109();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity110();
            }
        });
    }

    private void openActivity108() {
        Intent intent = new Intent(Activity11.this, Activity108.class);
        startActivity(intent);
    }

    private void openActivity109() {
        Intent intent = new Intent(Activity11.this, Activity109.class);
        startActivity(intent);
    }

    private void openActivity110() {
        Intent intent = new Intent(Activity11.this, Activity110.class);
        startActivity(intent);
    }


}
