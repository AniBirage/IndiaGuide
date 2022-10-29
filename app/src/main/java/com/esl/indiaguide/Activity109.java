package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity109 extends Activity11{

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity109);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity114();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity115();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity116();
            }
        });
    }

    private void openActivity114() {
        Intent intent = new Intent(Activity109.this, Activity114.class);
        startActivity(intent);
    }

    private void openActivity115() {
        Intent intent = new Intent(Activity109.this, Activity115.class);
        startActivity(intent);
    }

    private void openActivity116() {
        Intent intent = new Intent(Activity109.this, Activity116.class);
        startActivity(intent);
    }


}
