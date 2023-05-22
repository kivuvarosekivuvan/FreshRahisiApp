package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Customer : AppCompatActivity() {
    lateinit var btnConfirm:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)
        btnConfirm=findViewById(R.id.btnConfirm)
        btnConfirm.setOnClickListener {
            val intent=Intent(this,Admin_Landing::class.java)
            startActivity(intent)
        }
    }
}
