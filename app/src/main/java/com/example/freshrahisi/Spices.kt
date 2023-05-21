package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Spices : AppCompatActivity() {
    lateinit var btnBack4:Button
    lateinit var btnTumeric:Button
    lateinit var btnBlack:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spices)
        btnBack4 = findViewById(R.id.btnBack4)
        btnBack4.setOnClickListener {
            val intent = Intent(this, Category::class.java)
            startActivity(intent)
        }

        btnBlack = findViewById(R.id.btnPepper)
        btnBlack.setOnClickListener {
            val intent3 = Intent(this, Cart::class.java)
            startActivity(intent3)
        }
    }
}