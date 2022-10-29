package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity77 extends Activity8{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity77);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity83();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity84();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity85();
            }
        });

    }

    private void openActivity83() {
        Intent intent = new Intent(Activity77.this, Activity83.class);
        startActivity(intent);
    }

    private void openActivity84() {
        Intent intent = new Intent(Activity77.this, Activity84.class);
        startActivity(intent);
    }

    private void openActivity85() {
        Intent intent = new Intent(Activity77.this, Activity85.class);
        startActivity(intent);
    }


}

