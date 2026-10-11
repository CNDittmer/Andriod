package com.example.tasktrack

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var breedEditText: EditText
    private lateinit var addButton: Button
    private lateinit var flockTextView: TextView

    private val flock = mutableListOf<Chicken>()

    data class Chicken(val name: String, val breed: String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.nameEditText)
        breedEditText = findViewById(R.id.breedEditText)
        addButton = findViewById(R.id.addButton)
        flockTextView = findViewById(R.id.flockTextView)

        loadFlock()
        updateFlockDisplay()

        addButton.setOnClickListener { addChicken() }
    }

    private fun addChicken() {
        val name = nameEditText.text.toString().trim()
        val breed = breedEditText.text.toString().trim()

        if (name.isEmpty() && breed.isEmpty()) {
            Toast.makeText(this, "Please enter a chicken name and breed.", Toast.LENGTH_SHORT).show()
            return
        }
        if (name.isEmpty()) {
            Toast.makeText(this, "Please enter a chicken name.", Toast.LENGTH_SHORT).show()
            return
        }
        if (breed.isEmpty()) {
            Toast.makeText(this, "Please enter a chicken breed.", Toast.LENGTH_SHORT).show()
            return
        }

        flock.add(Chicken(name, breed))
        if (!saveFlock()) {
            flock.removeAt(flock.lastIndex)
            Toast.makeText(this, "Could not save chicken. Please try again.", Toast.LENGTH_LONG).show()
            return
        }

        updateFlockDisplay()
        Toast.makeText(this, "$name added to your flock!", Toast.LENGTH_SHORT).show()
        nameEditText.text.clear()
        breedEditText.text.clear()
        nameEditText.requestFocus()
    }

    private fun saveFlock(): Boolean {
        val json = JSONArray()
        for (chicken in flock) {
            json.put(JSONObject().apply {
                put("name", chicken.name)
                put("breed", chicken.breed)
            })
        }
        return getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .edit()
            .putString(FLOCK_KEY, json.toString())
            .commit()
    }

    private fun loadFlock() {
        val stored = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .getString(FLOCK_KEY, null) ?: return
        try {
            val json = JSONArray(stored)
            val loaded = mutableListOf<Chicken>()
            for (i in 0 until json.length()) {
                val item = json.getJSONObject(i)
                loaded.add(Chicken(item.getString("name"), item.getString("breed")))
            }
            flock.clear()
            flock.addAll(loaded)
        } catch (e: org.json.JSONException) {
            Toast.makeText(this, "Saved flock data could not be loaded.", Toast.LENGTH_LONG).show()
        }
    }

    private fun updateFlockDisplay() {
        if (flock.isEmpty()) {
            flockTextView.text = "No chickens added yet."
            return
        }
        val display = StringBuilder()
        flock.forEachIndexed { index, chicken ->
            display.append("${index + 1}. ${chicken.name} - ${chicken.breed}\n")
        }
        flockTextView.text = display.toString()
    }

    companion object {
        private const val PREFS_NAME = "flock_tracker_storage"
        private const val FLOCK_KEY = "saved_chickens"
    }
}