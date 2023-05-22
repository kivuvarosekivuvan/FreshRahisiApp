package com.example.freshrahisi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var get:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       get= findViewById(R.id.get)
        get.setOnClickListener {
            val intent3 = Intent(this, Choose::class.java)
            startActivity(intent3)
        }

        }
    }
