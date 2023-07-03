package com.example.hw_6_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction().add(R.id.PasterAbai_Fragment,PasterAbaiFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.music_container,MusicFragment()).commit()
        setContentView(R.layout.activity_main)
    }
}