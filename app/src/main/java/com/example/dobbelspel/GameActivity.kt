package com.example.dobbelspel

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

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
        //Create a six sided die and roll it
            val dice = Dice(6)
            val diceRoll = dice.roll()

        //Update the dice image to match the rolled number
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
        //Also change the content description to match the roll
        diceImage.contentDescription = diceRoll.toString()
    }

    data class Dice(private val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}