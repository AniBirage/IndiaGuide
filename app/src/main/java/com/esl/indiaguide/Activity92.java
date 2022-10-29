package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity92 extends Activity9 {
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity92);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity94();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity95();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity96();
            }
        });
    }

    private void openActivity94() {
        Intent intent = new Intent(Activity92.this, Activity94.class);
        startActivity(intent);
    }

    private void openActivity95() {
        Intent intent = new Intent(Activity92.this, Activity95.class);
        startActivity(intent);
    }

    private void openActivity96() {
        Intent intent = new Intent(Activity92.this, Activity96.class);
        startActivity(intent);
    }


}
