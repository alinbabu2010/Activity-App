package com.example.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This is the second activity to be used in the app.
 */
class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        // Accesing textview and assig value from MainActivity to textview
        val message = intent.getStringExtra("input").toString()
        Log.i("SubActivity",message)
        val text1 = findViewById<TextView>(R.id.textView2)
        text1.setText(message)

        // Getting button by id and move to previous activity on button click
        val buttonid = findViewById<Button>(R.id.button2)
        buttonid.setOnClickListener {
            val previous = Intent(this@SubActivity,MainActivity::class.java)
            startActivity(previous)
        }
    }

}