package com.example.first

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.button)
        val view=findViewById<TextView>(R.id.textView)
        val btn2=findViewById<Button>(R.id.button2)
        var v=0
        btn.setOnClickListener {
            v++
            view.setText("Counting Increased by "+v)
        }
        btn2.setOnClickListener{
            v--
            view.setText("Counting Decreased by "+v)
        }
    }

}