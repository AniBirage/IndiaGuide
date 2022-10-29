package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity46();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity47();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity48();
            }
        });
    }

    private void openActivity46() {
        Intent intent = new Intent(Activity3.this, Activity46.class);
        startActivity(intent);
    }

    private void openActivity47() {
        Intent intent = new Intent(Activity3.this, Activity47.class);
        startActivity(intent);
    }

    private void openActivity48() {
        Intent intent = new Intent(Activity3.this, Activity48.class);
        startActivity(intent);
    }

}

