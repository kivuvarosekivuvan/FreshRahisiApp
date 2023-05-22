package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cereals : AppCompatActivity() {
    lateinit var btnBack3 : Button
    lateinit var btnMaize : Button
    lateinit var btnMaize2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cereals)
        btnBack3 = findViewById(R.id.btnBack3)
        btnBack3.setOnClickListener {
            val intent = Intent(this, Category::class.java)
            startActivity(intent)
        }
        btnMaize = findViewById(R.id.btnMaize)
        btnMaize.setOnClickListener {
            val intent2 = Intent(this, Cart::class.java)
            startActivity(intent2)
        }

        btnMaize2 = findViewById(R.id.btnMaize2)
        btnMaize2.setOnClickListener {
            val intent2 = Intent(this, Cart::class.java)
            startActivity(intent2)
        }

    }}