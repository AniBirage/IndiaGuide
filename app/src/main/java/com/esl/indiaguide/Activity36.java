package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity36 extends AppCompatActivity {


    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity36);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity315();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity316();
            }
        });
    }

    private void openActivity315() {
        Intent intent = new Intent(Activity36.this, Activity315.class);
        startActivity(intent);
    }

    private void openActivity316() {
        Intent intent = new Intent(Activity36.this, Activity316.class);
        startActivity(intent);
    }


}
