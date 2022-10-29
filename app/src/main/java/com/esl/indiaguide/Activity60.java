package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity60 extends Activity6 {
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity60);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity62();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity63();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity64();
            }
        });
    }

    private void openActivity62() {
        Intent intent = new Intent(Activity60.this, Activity62.class);
        startActivity(intent);
    }

    private void openActivity63() {
        Intent intent = new Intent(Activity60.this, Activity63.class);
        startActivity(intent);
    }

    private void openActivity64() {
        Intent intent = new Intent(Activity60.this, Activity64.class);
        startActivity(intent);
    }


}
