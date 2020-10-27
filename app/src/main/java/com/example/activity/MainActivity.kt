package com.example.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


/**
 * This the main activity of the app
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Getting text from input field.
        val textId = findViewById<EditText>(R.id.inputField1)
        var inputText = textId.text.toString()
        Log.i("MainActivity", inputText)

        // Getting button by id and move to next activity on button click
        val buttonid = findViewById<Button>(R.id.button1)
        buttonid.setOnClickListener {
            val intent = Intent(this@MainActivity, SubActivity::class.java)
            intent.putExtra("input", inputText)
            startActivity(intent)

        }
    }
}