package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity10 extends AppCompatActivity {


    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity10);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity100();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity101();
            }
        });
    }

    private void openActivity100() {
        Intent intent = new Intent(Activity10.this, Activity100.class);
        startActivity(intent);
    }

    private void openActivity101() {
        Intent intent = new Intent(Activity10.this, Activity101.class);
        startActivity(intent);
    }


}
