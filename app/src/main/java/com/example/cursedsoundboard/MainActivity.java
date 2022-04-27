package com.example.cursedsoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped (View view) {
        int id = view.getId();
        String thisId = "";

        thisId = view.getResources().getResourceEntryName(id);

        int soundId = getResources().getIdentifier(thisId, "raw", "com.example.cursedsoundboard");

        MediaPlayer mplayer = MediaPlayer.create(getApplicationContext(), soundId);
        mplayer.start();

        Log.i("Button tapped", thisId);
    }
}