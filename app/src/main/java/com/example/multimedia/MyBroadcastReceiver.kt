package com.example.multimedia

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast

class MyBroadcastReceiver: BroadcastReceiver() {
    lateinit var mp:MediaPlayer
    override fun onReceive(context: Context?, intent: Intent?) {
        mp=MediaPlayer.create(context, R.raw.bikerintone);
        mp.start();
        Toast.makeText(context, "Alarm....", Toast.LENGTH_LONG).show();
    }
}