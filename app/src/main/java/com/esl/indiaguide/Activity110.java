package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity110 extends Activity11{

    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity110);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity117();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity118();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity119();
            }
        });
    }

    private void openActivity117() {
        Intent intent = new Intent(Activity110.this, Activity117.class);
        startActivity(intent);
    }

    private void openActivity118() {
        Intent intent = new Intent(Activity110.this, Activity118.class);
        startActivity(intent);
    }

    private void openActivity119() {
        Intent intent = new Intent(Activity110.this, Activity119.class);
        startActivity(intent);
    }


}
