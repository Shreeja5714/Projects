package com.example.personalizedgreeting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {

    private lateinit var nameInput: TextInputEditText
    private lateinit var greetButton: Button
    private lateinit var greetMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameInput = findViewById(R.id.name)
        greetButton = findViewById(R.id.greet)
        greetMessage = findViewById(R.id.textmess)

        greetButton.setOnClickListener {
            val name = nameInput.text.toString()
            val textmess = if(name.isNotEmpty()) {
                "Hello $name!"
            }
            else{
                "Hello!"
            }
            greetMessage.text = textmess
        }
    }
}