package com.example.freshrahisi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DeliveryAddress : AppCompatActivity() {
    lateinit var backDelivery: Button
    lateinit var btnMpesa: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delivery_address)
        btnMpesa=findViewById(R.id.btnMpesa)
        btnMpesa.setOnClickListener {
            val intent=Intent(this,Mpesa::class.java)
            startActivity(intent)
        }
        backDelivery=findViewById(R.id.backDelivery)
        backDelivery.setOnClickListener {
            val intent=Intent(this,Cart::class.java)
            startActivity(intent)
        }
    }
}