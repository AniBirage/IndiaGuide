package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity15 extends AppCompatActivity {


    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity15);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity152();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity153();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity154();
            }
        });
    }

    private void openActivity152() {
        Intent intent = new Intent(Activity15.this, Activity152.class);
        startActivity(intent);
    }

    private void openActivity153() {
        Intent intent = new Intent(Activity15.this, Activity153.class);
        startActivity(intent);
    }

    private void openActivity154() {
        Intent intent = new Intent(Activity15.this, Activity154.class);
        startActivity(intent);
    }


}
