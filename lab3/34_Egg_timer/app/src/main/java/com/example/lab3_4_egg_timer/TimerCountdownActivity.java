package com.example.lab3_4_egg_timer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.EditText;
import android.widget.TextView;


public class TimerCountdownActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_countdown);

        // get timer value from intent
        Intent intent = getIntent();
        int timerValue = intent.getIntExtra("TimerValue", 0);

        // start countdown timer
        new CountDownTimer(timerValue*1000, 1000) {
            public void onTick(long millisUntilFinished) {
                TextView textView = (TextView) findViewById(R.id.textView_timer);
                textView.setText("" + millisUntilFinished / 1000);
                //textView.setText("x");
            }

            public void onFinish() {
                TextView textView = (TextView) findViewById(R.id.textView_timer);
                textView.setText("DONE");
            }
        }.start();
    }

}
