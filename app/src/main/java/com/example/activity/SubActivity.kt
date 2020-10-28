package com.example.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
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
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("data",inputText)
            setResult(Activity.RESULT_OK,intent)
            finish()

        }
    }

}