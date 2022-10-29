package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity260 extends Activity28{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity260);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity268();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity269();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity270();
            }
        });
    }

    private void openActivity268() {
        Intent intent = new Intent(Activity260.this, Activity268.class);
        startActivity(intent);
    }

    private void openActivity269() {
        Intent intent = new Intent(Activity260.this, Activity269.class);
        startActivity(intent);
    }

    private void openActivity270() {
        Intent intent = new Intent(Activity260.this, Activity270.class);
        startActivity(intent);
    }
}
