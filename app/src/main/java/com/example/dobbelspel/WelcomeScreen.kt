package com.example.dobbelspel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNewGame = findViewById<Button>(R.id.btnNewGame) as Button
        btnNewGame.setOnClickListener {
            startActivity(Intent(this@WelcomeScreen, GameActivity::class.java))
        }
    }
}