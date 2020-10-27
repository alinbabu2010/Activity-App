package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

/**
 * This the main activity of the app
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Getting text from input field.
        val textId = findViewById<EditText>(R.id.inputField1)
        val inputText = textId.text.toString()

        // Getting button by id and move to next activity on button click
        val buttonid = findViewById<Button>(R.id.button1)
        buttonid.setOnClickListener {
            val next = Intent(this@MainActivity,SubActivity::class.java)
            startActivity(next)
        }
    }
}