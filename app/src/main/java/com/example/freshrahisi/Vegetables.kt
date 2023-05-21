package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.freshrahisi.R.id.btnAddToCart

class Vegetables : AppCompatActivity() {
    lateinit var btnBack1: Button
    lateinit var btnAddToCart:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegetables)
        btnBack1 = findViewById(R.id.btnBack1)
        btnBack1.setOnClickListener {
            val intent= Intent(this, Category::class.java)
            startActivity(intent)
        }

        btnAddToCart = findViewById(R.id.btnAddToCart)
        btnAddToCart.setOnClickListener {
            val intent2 = Intent(this,Cart::class.java)
            startActivity(intent2)
        }


    }
}
