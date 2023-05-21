package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fruits : AppCompatActivity() {
    lateinit var btnBack2 : Button
    lateinit var btnBanana : Button
    lateinit var btnOrange : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)
        btnBack2 = findViewById(R.id.btnBack2)
        btnBack2.setOnClickListener {
            val intent= Intent(this,Category::class.java)
            startActivity(intent)
        }
        btnOrange = findViewById(R.id.btnOrange)
        btnOrange.setOnClickListener {
            val intent3 = Intent(this,Cart::class.java)
            startActivity(intent3)
        }
    }
}