package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity245 extends Activity27 {
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity245);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity255();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity256();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity257();
            }
        });
    }

    private void openActivity255() {
        Intent intent = new Intent(Activity245.this, Activity255.class);
        startActivity(intent);
    }

    private void openActivity256() {
        Intent intent = new Intent(Activity245.this, Activity256.class);
        startActivity(intent);
    }

    private void openActivity257() {
        Intent intent = new Intent(Activity245.this, Activity257.class);
        startActivity(intent);
    }
}
