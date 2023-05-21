package com.example.freshrahisi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cart : AppCompatActivity() {
    lateinit var btnCheckOut1 : Button
    lateinit var backCart: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        btnCheckOut1 = findViewById(R.id.btnCheckout)
        btnCheckOut1.setOnClickListener {
            val intent = Intent(this,DeliveryAddress::class.java)
            startActivity(intent)
        }
        backCart = findViewById(R.id.backCart)
        backCart.setOnClickListener {
            val intent=Intent(this, Category::class.java)
            startActivity(intent)
        }
    }
}