package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity128 extends Activity13 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity128);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity131();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity132();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity133();
            }
        });
    }

    private void openActivity131() {
        Intent intent = new Intent(Activity128.this, Activity131.class);
        startActivity(intent);
    }

    private void openActivity132() {
        Intent intent = new Intent(Activity128.this, Activity132.class);
        startActivity(intent);
    }

    private void openActivity133() {
        Intent intent = new Intent(Activity128.this, Activity133.class);
        startActivity(intent);
    }
}

