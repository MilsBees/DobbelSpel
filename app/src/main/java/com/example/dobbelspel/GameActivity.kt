package com.example.dobbelspel

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        //Roll button as a variable
        val rollButton = findViewById<FloatingActionButton>(R.id.fab)

        //Roll the dice
        rollButton.setOnClickListener { rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val diceImage: ImageView = findViewById(R.id.imageViewDice1)
        val drawableResource = when (diceRoll) {
            1 -> (R.drawable.dice_six_faces_one)
            2 -> (R.drawable.dice_six_faces_two)
            3 -> (R.drawable.dice_six_faces_three)
            4 -> (R.drawable.dice_six_faces_four)
            5 -> (R.drawable.dice_six_faces_five)
            else -> (R.drawable.dice_six_faces_six)
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()
    }

    class Dice(private val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}