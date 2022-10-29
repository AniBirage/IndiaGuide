package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity199 extends Activity22 {

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity199);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity209();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity210();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity211();
            }
        });
    }

    private void openActivity209() {
        Intent intent = new Intent(Activity199.this, Activity209.class);
        startActivity(intent);
    }

    private void openActivity210() {
        Intent intent = new Intent(Activity199.this, Activity210.class);
        startActivity(intent);
    }

    private void openActivity211() {
        Intent intent = new Intent(Activity199.this, Activity211.class);
        startActivity(intent);
    }
}

