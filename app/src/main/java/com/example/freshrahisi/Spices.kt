package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Spices : AppCompatActivity() {
    lateinit var btnBack4:Button
    lateinit var btnPepper:Button
    lateinit var btnPepper2:Button
    lateinit var btnBlack:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spices)
        btnBack4 = findViewById(R.id.btnBack4)
        btnBack4.setOnClickListener {
            val intent = Intent(this, Category::class.java)
            startActivity(intent)
        }

        btnPepper = findViewById(R.id.btnPepper)
        btnPepper.setOnClickListener {
            val intent3 = Intent(this, Cart::class.java)
            startActivity(intent3)
        }
        btnPepper2 = findViewById(R.id.btnPepper2)
        btnPepper2.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }
}