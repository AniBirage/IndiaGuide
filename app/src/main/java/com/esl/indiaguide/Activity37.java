package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity37 extends AppCompatActivity {

    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity37);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity323();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity324();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity325();
            }
        });
    }

    private void openActivity323() {
        Intent intent = new Intent(Activity37.this, Activity323.class);
        startActivity(intent);
    }

    private void openActivity324() {
        Intent intent = new Intent(Activity37.this, Activity324.class);
        startActivity(intent);
    }

    private void openActivity325() {
        Intent intent = new Intent(Activity37.this, Activity325.class);
        startActivity(intent);
    }

}

