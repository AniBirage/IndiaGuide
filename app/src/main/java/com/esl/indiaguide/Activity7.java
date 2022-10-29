package com.esl.indiaguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity7 extends AppCompatActivity {


    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity7);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity68();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity69();
            }
        });
    }

    private void openActivity68() {
        Intent intent = new Intent(Activity7.this, Activity68.class);
        startActivity(intent);
    }

    private void openActivity69() {
        Intent intent = new Intent(Activity7.this, Activity69.class);
        startActivity(intent);
    }


}
