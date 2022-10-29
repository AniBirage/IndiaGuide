package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity31 extends AppCompatActivity {


    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity31);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity290();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity291();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity292();
            }
        });
    }

    private void openActivity290() {
        Intent intent = new Intent(Activity31.this, Activity290.class);
        startActivity(intent);
    }

    private void openActivity291() {
        Intent intent = new Intent(Activity31.this, Activity291.class);
        startActivity(intent);
    }

    private void openActivity292() {
        Intent intent = new Intent(Activity31.this, Activity292.class);
        startActivity(intent);
    }


}
