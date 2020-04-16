package com.example.lab2_4_lets_practice_a_bit_more_event_handling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText = null;
    private TextView textView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button englishBtn = new Button(this);
        englishBtn.setText("ENGLISH");
        englishBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setGreeting("Hi");
            }
        });

        Button sverigeBtn = new Button(this);
        sverigeBtn.setText("SVERIGE");
        sverigeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setGreeting("Hejjsan");
            }
        });

        // first button row layout
        LinearLayout firstBtnLayout = new LinearLayout(this);
        firstBtnLayout.setOrientation(LinearLayout.HORIZONTAL);
        firstBtnLayout.setGravity(Gravity.CENTER);
        firstBtnLayout.addView(englishBtn);
        firstBtnLayout.addView(sverigeBtn);

        Button suomeksiBtn = new Button(this);
        suomeksiBtn.setText("SUOMEKSI");
        suomeksiBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setGreeting("Terve");
            }
        });

        Button surpriseBtn = new Button(this);
        surpriseBtn.setText("SURPRISE");
        surpriseBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setGreeting("Hola");
            }
        });

        // second button row layout
        LinearLayout secondBtnLayout = new LinearLayout(this);
        secondBtnLayout.setOrientation(LinearLayout.HORIZONTAL);
        secondBtnLayout.setGravity(Gravity.CENTER);
        secondBtnLayout.addView(suomeksiBtn);
        secondBtnLayout.addView(surpriseBtn);

        editText = new EditText(this);

        textView = new TextView(this);
        textView.setTextSize(26);

        // app vertical layout contains text editor, button rows and text
        LinearLayout verticalLayout = new LinearLayout(this);
        verticalLayout.setOrientation(LinearLayout.VERTICAL);
        verticalLayout.addView(editText);
        verticalLayout.addView(firstBtnLayout);
        verticalLayout.addView(secondBtnLayout);
        verticalLayout.addView(textView);

        setContentView(verticalLayout);
    }


    private void setGreeting(String greeting) {
        textView.setText(greeting + " " + editText.getText().toString());
    }

}
