package com.example.feng.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextButton = findViewById(R.id.button)

        nextButton.setOnClickListener() {
            Intent(this@MainActivity, ProfileScreen::class.java).also{
                startActivity(it)
            }
        }
    }
}