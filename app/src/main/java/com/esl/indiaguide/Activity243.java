package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity243 extends Activity27 {
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity243);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity249();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity250();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity251();
            }
        });
    }

    private void openActivity249() {
        Intent intent = new Intent(Activity243.this, Activity249.class);
        startActivity(intent);
    }

    private void openActivity250() {
        Intent intent = new Intent(Activity243.this, Activity250.class);
        startActivity(intent);
    }

    private void openActivity251() {
        Intent intent = new Intent(Activity243.this, Activity251.class);
        startActivity(intent);
    }
}
