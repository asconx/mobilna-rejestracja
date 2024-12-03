package com.example.rejestracja2

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find Spinner by ID
        val spinner: Spinner = findViewById(R.id.spinner)

        // Create an ArrayAdapter using the string array and a default spinner layout
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.gender_array, // Reference to the string array defined in strings.xml
            android.R.layout.simple_spinner_item // Default layout for Spinner items
        )

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Apply the adapter to the Spinner
        spinner.adapter = adapter

        // Set item selection listener
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                Toast.makeText(this@MainActivity, "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Handle the case when no item is selected
            }
        }
    }
}
