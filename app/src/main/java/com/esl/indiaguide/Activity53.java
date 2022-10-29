package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity53 extends Activity5 {
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity53);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity57();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity58();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity59();
            }
        });
    }

    private void openActivity57() {
        Intent intent = new Intent(Activity53.this, Activity57.class);
        startActivity(intent);
    }

    private void openActivity58() {
        Intent intent = new Intent(Activity53.this, Activity58.class);
        startActivity(intent);
    }

    private void openActivity59() {
        Intent intent = new Intent(Activity53.this, Activity59.class);
        startActivity(intent);
    }


}
