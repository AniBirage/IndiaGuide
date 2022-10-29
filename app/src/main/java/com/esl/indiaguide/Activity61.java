package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity61 extends Activity6 {
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity61);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity65();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity66();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity67();
            }
        });
    }

    private void openActivity65() {
        Intent intent = new Intent(Activity61.this, Activity65.class);
        startActivity(intent);
    }

    private void openActivity66() {
        Intent intent = new Intent(Activity61.this, Activity66.class);
        startActivity(intent);
    }

    private void openActivity67() {
        Intent intent = new Intent(Activity61.this, Activity67.class);
        startActivity(intent);
    }


}
