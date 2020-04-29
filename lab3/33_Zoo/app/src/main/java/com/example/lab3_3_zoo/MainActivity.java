package com.example.lab3_3_zoo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMammals();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // load menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.animal_menu, menu);
        return true;
    }


    public void setBirds() {
        // set bird images and store sound ID to image tag
        ImageView iv = null;

        iv = (ImageView) findViewById(R.id.imageView1);
        iv.setImageResource(R.drawable.huuhkaja);
        iv.setTag(R.raw.huuhkaja_norther_eagle_owl);

        iv = (ImageView) findViewById(R.id.imageView2);
        iv.setImageResource(R.drawable.peippo);
        iv.setTag(R.raw.peippo_chaffinch);

        iv = (ImageView) findViewById(R.id.imageView3);
        iv.setImageResource(R.drawable.peukaloinen);
        iv.setTag(R.raw.peukaloinen_wren);

        iv = (ImageView) findViewById(R.id.imageView4);
        iv.setImageResource(R.drawable.punatulkku);
        iv.setTag(R.raw.punatulkku_northern_bullfinch);
    }


    public void setMammals() {
        // set mammal images and store sound ID to image tag
        ImageView iv = null;

        iv = (ImageView) findViewById(R.id.imageView1);
        iv.setImageResource(R.drawable.bear);
        iv.setTag(R.raw.bear);

        iv = (ImageView) findViewById(R.id.imageView2);
        iv.setImageResource(R.drawable.wolf);
        iv.setTag(R.raw.wolf);

        iv = (ImageView) findViewById(R.id.imageView3);
        iv.setImageResource(R.drawable.elephant);
        iv.setTag(R.raw.elephant);

        iv = (ImageView) findViewById(R.id.imageView4);
        iv.setImageResource(R.drawable.lamb);
        iv.setTag(R.raw.lamb);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle menu selection
        if (item.getItemId() == R.id.menu_birds) {
            setBirds();
        } else if (item.getItemId() == R.id.menu_mammals) {
            setMammals();
        }
        return true;
    }


    public void playAnimalSound(View view) {
        // play animal sound, sound ID is stored in image tag
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, (int) view.getTag());
        mediaPlayer.start();
    }

}
