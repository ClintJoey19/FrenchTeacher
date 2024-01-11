package com.cj.frenchteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button black, green, purple, red, yellow;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        black = findViewById(R.id.black);
        green = findViewById(R.id.green);
        purple = findViewById(R.id.purple);
        red = findViewById(R.id.red);
        yellow = findViewById(R.id.yellow);

        black.setOnClickListener(this);
        green.setOnClickListener(this);
        purple.setOnClickListener(this);
        red.setOnClickListener(this);
        yellow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.black) {
            playSound(R.raw.black);
        }
        if (id == R.id.green) {
            playSound(R.raw.green);
        }
        if (id == R.id.purple) {
            playSound(R.raw.purple);
        }
        if (id == R.id.red) {
            playSound(R.raw.red);
        }
        if (id == R.id.yellow) {
            playSound(R.raw.yellow);
        }
    }
    private void playSound(int soundId) {
        mediaPlayer = MediaPlayer.create(this, soundId);
        mediaPlayer.start();
    }
}