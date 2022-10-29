package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity153 extends Activity15{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity153);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity158();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity159();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity160();
            }
        });
    }

    private void openActivity158() {
        Intent intent = new Intent(Activity153.this, Activity158.class);
        startActivity(intent);
    }

    private void openActivity159() {
        Intent intent = new Intent(Activity153.this, Activity159.class);
        startActivity(intent);
    }

    private void openActivity160() {
        Intent intent = new Intent(Activity153.this, Activity160.class);
        startActivity(intent);
    }

}
