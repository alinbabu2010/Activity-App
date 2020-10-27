package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * This is the second activity to be used in the app.
 */
class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        // Getting button by id and move to previous activity on button click
        val buttonid = findViewById<Button>(R.id.button2)
        buttonid.setOnClickListener {
            val previous = Intent(this@SubActivity,MainActivity::class.java)
            startActivity(previous)
        }
    }

}