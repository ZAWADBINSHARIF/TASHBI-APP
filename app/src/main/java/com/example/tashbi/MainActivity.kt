package com.example.tashbi

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tashbiClickSound = MediaPlayer.create(this, R.raw.tashbi_sound)
        val restoreClickSound = MediaPlayer.create(this, R.raw.restore_sound_2)

        counter_btn.setOnClickListener {
            val op = counterNumber.text.toString().toInt() + 1
            counterNumber.text = "$op"
            tashbiClickSound.start()
        }
        restoreBtn.setOnClickListener {
            val op = "00"
            counterNumber.text = op
            restoreClickSound.start()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
