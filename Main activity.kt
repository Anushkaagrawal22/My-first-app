package com.example.dice

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById(R.id.roll_button)
        rollbutton.setOnClickListener { it: View? ->
            rolldice()
        }
    }

    private fun rolldice() {
        val randomInt = Random.nextInt(6)+1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice1confirm
            2 -> R.drawable.dice2shayad
            3 -> R.drawable.dice3confirm
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        val diceImage: ImageView=findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)
    }
}
