package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity120 extends Activity12 {

        private Button button, button2, button3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity120);

            button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity122();
                }
            });

            button2 = (Button) findViewById(R.id.button2);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity123();
                }
            });

            button3 = (Button) findViewById(R.id.button3);
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity124();
                }
            });
        }

        private void openActivity122() {
            Intent intent = new Intent(Activity120.this, Activity122.class);
            startActivity(intent);
        }

        private void openActivity123() {
            Intent intent = new Intent(Activity120.this, Activity123.class);
            startActivity(intent);
        }

        private void openActivity124() {
            Intent intent = new Intent(Activity120.this, Activity124.class);
            startActivity(intent);
        }
    }

