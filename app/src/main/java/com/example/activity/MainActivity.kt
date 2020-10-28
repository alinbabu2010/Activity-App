package com.example.activity

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Html.fromHtml
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


/**
 * This the main activity of the app
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Accessing textview and assign value from MainActivity to textview
        val message = intent.getStringExtra("input")
        val text1 = findViewById<TextView>(R.id.textView1)
        text1.text = message

        // Getting button by id and move to next activity on button click
        val buttonid = findViewById<Button>(R.id.button1)
        buttonid.setOnClickListener {

            // Getting text from input field.
            val textId = findViewById<EditText>(R.id.inputField1)
            val inputText = textId.text.toString()

            // Passing input text value and starting new activity
            val intent = Intent(applicationContext, SubActivity::class.java)
            intent.putExtra("input", inputText)
            startActivityForResult(intent,PICK_CONTACT_REQUEST)


        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == PICK_CONTACT_REQUEST) {
                if (intent != null){
                    // Accessing textview and assign value from MainActivity to textview
                    val message = intent.getStringExtra("data")
                    val text1 = findViewById<TextView>(R.id.textView1)
                    text1.text = message
                }
            }
        }
    }

    companion object {
        internal val PICK_CONTACT_REQUEST = 0
    }

}