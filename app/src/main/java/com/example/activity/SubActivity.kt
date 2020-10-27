@file:Suppress("DEPRECATION")

package com.example.activity

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This is the second activity to be used in the app.
 */
class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        // Change the font color of action bar
        supportActionBar?.setTitle(Html.fromHtml("<font color=\"#4e342e\">" + getString(R.string.app_name) + "</font>"))

        // Accessing textview and assign value from MainActivity to textview
        val message = intent.getStringExtra("input")
        val text1 = findViewById<TextView>(R.id.textView2)
        text1.text = message

        // Getting button by id and move to previous activity on button click
        val buttonid = findViewById<Button>(R.id.button2)
        buttonid.setOnClickListener {

            // Getting text from input field.
            val textId = findViewById<EditText>(R.id.inputField2)
            val inputText = textId.text.toString()

            // Passing input text value and starting previous activity again
            val intent = Intent(this@SubActivity,MainActivity::class.java)
            intent.putExtra("input",inputText)
            startActivity(intent)
        }
    }

}