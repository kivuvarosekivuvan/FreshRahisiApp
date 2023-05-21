package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mpesa : AppCompatActivity() {
    lateinit var btnBackdelivery:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mpesa)
        btnBackdelivery= findViewById(R.id.btnBackdelivery)
        btnBackdelivery.setOnClickListener {
            val intent=Intent(this,DeliveryAddress::class.java)
            startActivity(intent)
        }
    }
}