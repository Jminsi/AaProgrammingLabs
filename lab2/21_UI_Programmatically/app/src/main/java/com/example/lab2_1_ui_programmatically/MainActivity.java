package com.example.lab2_1_ui_programmatically;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button gameButton;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gameButton = new Button(this);
        gameButton.setText("Hello, I'm the button");
        gameButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // increase counter and update button text
                counter++;
                gameButton.setText("YOU HAVE PRESSED THE BUTTON " + counter + " TIMES.");
            }
        });

        setContentView(gameButton);
    }

}
