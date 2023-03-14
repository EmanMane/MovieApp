  package com.example.rma_lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

  class MainActivity : AppCompatActivity() {
      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)
          //Getting view button reference through id-a
          val button = findViewById<Button>(R.id.button1);
          //Defining action in case of a click
          button.setOnClickListener {
              showMessage()
          }
      }

      private fun showMessage() {
          // Finding our edit text and text view based on id
          val editText = findViewById<EditText>(R.id.editText1)
          val textView = findViewById<TextView>(R.id.textView1)
          // Text to variable
          val message = editText.text.toString()
          // Setting text
          textView.text = message
      }
  }