package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity28 extends AppCompatActivity {


    private Button button, button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity28);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity258();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity259();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity260();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity261();
            }
        });
    }

    private void openActivity258() {
        Intent intent = new Intent(Activity28.this, Activity258.class);
        startActivity(intent);
    }

    private void openActivity259() {
        Intent intent = new Intent(Activity28.this, Activity259.class);
        startActivity(intent);
    }

    private void openActivity260() {
        Intent intent = new Intent(Activity28.this, Activity260.class);
        startActivity(intent);
    }

    private void openActivity261() {
        Intent intent = new Intent(Activity28.this, Activity261.class);
        startActivity(intent);
    }


}
