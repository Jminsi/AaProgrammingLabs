package com.example.lab2_2_more_complex_ui_programmatically;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button addBtn = new Button(this);
        addBtn.setText("ADD");
        Button editBtn = new Button(this);
        editBtn.setText("EDIT");
        Button removeBtn = new Button(this);
        removeBtn.setText("REMOVE");

        // buttons row layout
        LinearLayout btnLayout = new LinearLayout(this);
        btnLayout.setOrientation(LinearLayout.HORIZONTAL);
        btnLayout.setGravity(Gravity.CENTER);
        btnLayout.addView(addBtn);
        btnLayout.addView(editBtn);
        btnLayout.addView(removeBtn);

        EditText editText = new EditText(this);
        ListView listView = new ListView(this);
        final String[] COUNTRIES = new String[]{
                "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra",
                "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina",
                "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan"
        };
        final ArrayAdapter<String> aa;
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                COUNTRIES);
        listView.setAdapter(aa);

        // app layout contains button row, text editor and list
        LinearLayout verticalLayout = new LinearLayout(this);
        verticalLayout.setOrientation(LinearLayout.VERTICAL);
        verticalLayout.addView(btnLayout);
        verticalLayout.addView(editText);
        verticalLayout.addView(listView);

        setContentView(verticalLayout);
    }

}
