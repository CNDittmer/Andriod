package com.example.tasktrack

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var breedEditText: EditText
    private lateinit var addButton: Button
    private lateinit var flockTextView: TextView

    // Stores chickens while the application is running
    private val flock = mutableListOf<Chicken>()

    data class Chicken(
        val name: String,
        val breed: String
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Connect Kotlin variables to XML elements
        nameEditText = findViewById(R.id.nameEditText)
        breedEditText = findViewById(R.id.breedEditText)
        addButton = findViewById(R.id.addButton)
        flockTextView = findViewById(R.id.flockTextView)

        addButton.setOnClickListener {
            addChicken()
        }
    }

    private fun addChicken() {
        val name = nameEditText.text.toString().trim()
        val breed = breedEditText.text.toString().trim()

        // Validate user input
        if (name.isEmpty() && breed.isEmpty()) {
            Toast.makeText(
                this,
                "Please enter a chicken name and breed.",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        if (name.isEmpty()) {
            Toast.makeText(
                this,
                "Please enter a chicken name.",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        if (breed.isEmpty()) {
            Toast.makeText(
                this,
                "Please enter a chicken breed.",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        // Add chicken to the flock
        flock.add(Chicken(name, breed))

        updateFlockDisplay()

        Toast.makeText(
            this,
            "$name added to your flock!",
            Toast.LENGTH_SHORT
        ).show()

        // Clear fields for the next chicken
        nameEditText.text.clear()
        breedEditText.text.clear()
        nameEditText.requestFocus()
    }

    private fun updateFlockDisplay() {
        if (flock.isEmpty()) {
            flockTextView.text = "No chickens added yet."
            return
        }

        val flockDisplay = StringBuilder()

        flock.forEachIndexed { index, chicken ->
            flockDisplay.append(
                "${index + 1}. ${chicken.name} - ${chicken.breed}\n"
            )
        }

        flockTextView.text = flockDisplay.toString()
    }
}