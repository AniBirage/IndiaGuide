package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity33 extends AppCompatActivity {


    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity33);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity296();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity297();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity298();
            }
        });
    }

    private void openActivity296() {
        Intent intent = new Intent(Activity33.this, Activity296.class);
        startActivity(intent);
    }

    private void openActivity297() {
        Intent intent = new Intent(Activity33.this, Activity297.class);
        startActivity(intent);
    }

    private void openActivity298() {
        Intent intent = new Intent(Activity33.this, Activity298.class);
        startActivity(intent);
    }


}
