package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity24 extends AppCompatActivity {


    private Button button, button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity24);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity215();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity216();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity217();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity218();
            }
        });
    }

    private void openActivity215() {
        Intent intent = new Intent(Activity24.this, Activity215.class);
        startActivity(intent);
    }

    private void openActivity216() {
        Intent intent = new Intent(Activity24.this, Activity216.class);
        startActivity(intent);
    }

    private void openActivity217() {
        Intent intent = new Intent(Activity24.this, Activity217.class);
        startActivity(intent);
    }

    private void openActivity218() {
        Intent intent = new Intent(Activity24.this, Activity218.class);
        startActivity(intent);
    }


}
