package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity13 extends AppCompatActivity {


    private Button button, button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity13);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity128();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity129();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity130();
            }
        });
    }

    private void openActivity128() {
        Intent intent = new Intent(Activity13.this, Activity128.class);
        startActivity(intent);
    }

    private void openActivity129() {
        Intent intent = new Intent(Activity13.this, Activity129.class);
        startActivity(intent);
    }

    private void openActivity130() {
        Intent intent = new Intent(Activity13.this, Activity130.class);
        startActivity(intent);
    }


}
