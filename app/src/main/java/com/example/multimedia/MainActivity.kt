package com.example.multimedia

import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.PendingIntent
import android.app.WallpaperManager
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException


class MainActivity : AppCompatActivity() {
    lateinit var edt:EditText
    lateinit var btn:Button
    var txt:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.button)

        btn.setOnClickListener {
            stayAlert()
        }


    }

    private fun stayAlert() {
        val text = findViewById<View>(R.id.time) as EditText
      val   secs = Integer.parseInt(text.text.toString())
            val i = Intent(this, MyBroadcastReceiver::class.java)
            val pendingIntent = PendingIntent.getBroadcast(this.applicationContext, 2323232, i, 0)
            val alarmmanger: AlarmManager = getSystemService(ALARM_SERVICE) as AlarmManager;
            alarmmanger.set(
                AlarmManager.RTC_WAKEUP,
                System.currentTimeMillis() + (secs * 1000),
                pendingIntent
            );
            Toast.makeText(this, "alarm Set in " + secs + "Seconds", Toast.LENGTH_LONG).show()
        }



}