package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity29 extends AppCompatActivity {


    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity29);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity274();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity275();
            }
        });
    }

    private void openActivity274() {
        Intent intent = new Intent(Activity29.this, Activity274.class);
        startActivity(intent);
    }

    private void openActivity275() {
        Intent intent = new Intent(Activity29.this, Activity275.class);
        startActivity(intent);
    }


}
