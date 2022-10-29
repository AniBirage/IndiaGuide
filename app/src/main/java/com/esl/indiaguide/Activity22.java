package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity22 extends AppCompatActivity {


    private Button button, button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity22);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity196();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity197();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity198();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity199();
            }
        });
    }

    private void openActivity196() {
        Intent intent = new Intent(Activity22.this, Activity196.class);
        startActivity(intent);
    }

    private void openActivity197() {
        Intent intent = new Intent(Activity22.this, Activity197.class);
        startActivity(intent);
    }

    private void openActivity198() {
        Intent intent = new Intent(Activity22.this, Activity198.class);
        startActivity(intent);
    }

    private void openActivity199() {
        Intent intent = new Intent(Activity22.this, Activity199.class);
        startActivity(intent);
    }


}
