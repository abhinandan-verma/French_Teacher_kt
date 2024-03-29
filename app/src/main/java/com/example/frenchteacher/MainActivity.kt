package com.example.frenchteacher

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    @SuppressLint("DiscouragedApi")
    fun sayColor(view : View){
        val clickedButton : Button = view as Button

        val mediaPlayer: MediaPlayer =
            MediaPlayer.create(this,resources
                .getIdentifier(clickedButton.tag.toString(),
                    "raw",
                    packageName))
        mediaPlayer.start()
    }
}