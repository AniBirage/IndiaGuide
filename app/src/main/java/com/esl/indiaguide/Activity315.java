package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity315 extends Activity36{
    private Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity315);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity317();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity318();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity319();
            }
        });
    }

    private void openActivity317() {
        Intent intent = new Intent(Activity315.this, Activity317.class);
        startActivity(intent);
    }

    private void openActivity318() {
        Intent intent = new Intent(Activity315.this, Activity318.class);
        startActivity(intent);
    }

    private void openActivity319() {
        Intent intent = new Intent(Activity315.this, Activity319.class);
        startActivity(intent);
    }
}
