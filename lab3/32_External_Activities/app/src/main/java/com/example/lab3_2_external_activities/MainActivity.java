package com.example.lab3_2_external_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = null;
        b = findViewById(R.id.button_map);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // go to OAMK address on map
                Uri location = Uri.parse("geo:0,0?q=Oamk+Kotkantie,1,Oulu");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);
            }
        });

        b = findViewById(R.id.button_call);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // call to OAMK phone number
                Uri number = Uri.parse("tel:+358206110200");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });

        b = findViewById(R.id.button_go);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editText);
                String userInput = editText.getText().toString();

                // if web address does not start with http or https it will crash application, add http if it is missing
                if(userInput.startsWith("https://") == false || (userInput.startsWith("http://") == false)) {
                    userInput = "http://" + userInput;
                }

                // go to requested web address
                Uri webpage = Uri.parse(userInput);
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

    }

}
