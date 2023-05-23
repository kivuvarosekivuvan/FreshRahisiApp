package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registration : AppCompatActivity() {
         lateinit var  btnSubmit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        btnSubmit=findViewById(R.id.btnCancel)
        btnSubmit.setOnClickListener {
            var intent= Intent( this, MamaMboga::class.java)
            startActivity(intent)
        }
    }}
