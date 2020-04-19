package com.example.lab3_1_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // load menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.color_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle menu selection

        TextView textView = findViewById(R.id.color_text);
        View view = findViewById(R.id.main_layout);

        if (item.getItemId() == R.id.menu_red) {
            textView.setText("RED");
            view.setBackgroundColor(Color.RED);
        } else if (item.getItemId() == R.id.menu_green) {
            textView.setText("GREEN");
            view.setBackgroundColor(Color.GREEN);
        } else if (item.getItemId() == R.id.menu_blue) {
            textView.setText("BLUE");
            view.setBackgroundColor(Color.BLUE);
        } else if (item.getItemId() == R.id.menu_yellow) {
            textView.setText("YELLOW");
            view.setBackgroundColor(Color.YELLOW);
        }

        return true;
    }

}
