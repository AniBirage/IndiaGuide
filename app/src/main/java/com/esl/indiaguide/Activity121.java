package com.esl.indiaguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity121 extends Activity12{

        private Button button, button2, button3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity121);

            button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity125();
                }
            });

            button2 = (Button) findViewById(R.id.button2);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity126();
                }
            });

            button3 = (Button) findViewById(R.id.button3);
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openActivity127();
                }
            });
        }

        private void openActivity125() {
            Intent intent = new Intent(Activity121.this, Activity125.class);
            startActivity(intent);
        }

        private void openActivity126() {
            Intent intent = new Intent(Activity121.this, Activity126.class);
            startActivity(intent);
        }

        private void openActivity127() {
            Intent intent = new Intent(Activity121.this, Activity127.class);
            startActivity(intent);
        }
    }
