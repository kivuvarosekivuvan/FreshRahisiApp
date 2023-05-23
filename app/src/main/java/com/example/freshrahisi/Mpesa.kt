package com.example.freshrahisi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Mpesa : AppCompatActivity() {
    lateinit var btnBackdelivery:ImageView
    lateinit var btnCancel:Button
    lateinit var btnSubmit:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mpesa)
        btnBackdelivery= findViewById(R.id.btnBackdelivery)
        btnBackdelivery.setOnClickListener {
            val intent=Intent(this,Category::class.java)
            startActivity(intent)
        }

        btnCancel = findViewById(R.id.btnCancel)
        btnCancel.setOnClickListener {
            val intent3 = Intent(this,Cart::class.java)
            startActivity(intent3)
        }
        btnSubmit = findViewById(R.id.btnSubmit)
        btnSubmit.setOnClickListener {
            val intent3 = Intent(this,Lastpage::class.java)
            startActivity(intent3)
        }

    }
}