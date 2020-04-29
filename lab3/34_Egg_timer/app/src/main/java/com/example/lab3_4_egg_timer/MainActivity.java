package com.example.lab3_4_egg_timer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startTimer(View view) {
        Intent intent = new Intent(this, TimerCountdownActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String text = editText.getText().toString();
        // change user input to integer, parseInt throws exception if text is not integer
        try {
            intent.putExtra("TimerValue", Integer.parseInt(text));
            startActivity(intent);
        } catch (Exception e) {
            // do nothing because user input was not valid integer
        }
    }

}
