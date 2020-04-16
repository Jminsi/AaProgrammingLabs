package com.example.lab2_3_implement_more_functionality;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    private ArrayList countryList = new ArrayList<String>();
    private ArrayAdapter<String> aa = null;
    private EditText editText = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button addBtn = new Button(this);
        addBtn.setText("ADD");
        addBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // add country to list and notify adapter that data has been changed
                countryList.add(editText.getText().toString());
                aa.notifyDataSetChanged();
            }
        });

        Button editBtn = new Button(this);
        editBtn.setText("EDIT");
        Button removeBtn = new Button(this);
        removeBtn.setText("REMOVE");
        removeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // remove country from list and notify adapter that data has been changed
                countryList.remove(editText.getText().toString());
                aa.notifyDataSetChanged();
            }
        });

        // button row layout
        LinearLayout btnLayout = new LinearLayout(this);
        btnLayout.setOrientation(LinearLayout.HORIZONTAL);
        btnLayout.setGravity(Gravity.CENTER);
        btnLayout.addView(addBtn);
        btnLayout.addView(editBtn);
        btnLayout.addView(removeBtn);

        editText = new EditText(this);
        ListView listView = new ListView(this);

        final String[] COUNTRIES = new String[]{
                "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra",
                "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina",
                "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan"
        };

        // add initial countries to list
        for (int i = 0; i < COUNTRIES.length; i++) {
            countryList.add(COUNTRIES[i]);
        }

        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countryList);
        listView.setAdapter(aa);

        // app layout contains buttons, text editor and list
        LinearLayout verticalLayout = new LinearLayout(this);
        verticalLayout.setOrientation(LinearLayout.VERTICAL);
        verticalLayout.addView(btnLayout);
        verticalLayout.addView(editText);
        verticalLayout.addView(listView);

        setContentView(verticalLayout);
    }

}
