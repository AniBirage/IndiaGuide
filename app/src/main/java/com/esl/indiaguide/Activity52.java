package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity52 extends Activity5 {
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity52);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity54();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity55();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity56();
            }
        });
    }

    private void openActivity54() {
        Intent intent = new Intent(Activity52.this, Activity54.class);
        startActivity(intent);
    }

    private void openActivity55() {
        Intent intent = new Intent(Activity52.this, Activity55.class);
        startActivity(intent);
    }

    private void openActivity56() {
        Intent intent = new Intent(Activity52.this, Activity56.class);
        startActivity(intent);
    }


}
