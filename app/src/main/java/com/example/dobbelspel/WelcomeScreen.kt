package com.example.dobbelspel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNewGame = findViewById<Button>(R.id.btnNewGame) as Button
        btnNewGame.setOnClickListener {
            startActivity(Intent(this@WelcomeScreen, GameActivity::class.java))
        }

        val btnRules = findViewById<Button>(R.id.btnRules) as Button
        btnRules.setOnClickListener {
            startActivity(Intent(this@WelcomeScreen, RulesActivity::class.java))
        }

        val btnHighScores = findViewById<Button>(R.id.btnHighScores) as Button
        btnHighScores.setOnClickListener {
            startActivity(Intent(this@WelcomeScreen, HighScoresActivity::class.java))
        }
    }
}