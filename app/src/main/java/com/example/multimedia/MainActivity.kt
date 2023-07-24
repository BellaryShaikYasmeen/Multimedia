package com.example.multimedia

import android.annotation.SuppressLint
import android.app.WallpaperManager
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException


class MainActivity : AppCompatActivity() {

    lateinit var img:ImageView
    lateinit var btn:Button


//    var imageResource = resources.getIdentifier(uri, null, packageName);
//    var res:Drawable=resources.getDrawable(imageResource,theme)


    //val wallpaperManager=WallpaperManager.getInstance(applicationContext)
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img=findViewById<View>(R.id.img) as ImageView
        btn=findViewById<View>(R.id.btn) as Button
        img.setImageResource(R.drawable.download)
        val wallpaperManager=WallpaperManager.getInstance(applicationContext)

        btn.setOnClickListener {
            try{
          //    img.setImageResource(R.drawable.download)
                wallpaperManager.setResource(R.drawable.wallpaper)
            }
            catch (e: IOException) {
                // here the errors can be logged instead of printStackTrace
                e.printStackTrace()
            }
        }
    }







}