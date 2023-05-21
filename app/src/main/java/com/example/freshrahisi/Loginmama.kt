package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Loginmama : AppCompatActivity() {
       lateinit var btnLogin:Button
    lateinit var btnRegistration: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginmama)
        btnLogin=findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            var intent= Intent( this, LandingPage::class.java)
            startActivity(intent)
        }
        btnRegistration=findViewById(R.id.btnRegistration)
        btnRegistration.setOnClickListener {
            var intent= Intent( this, registration::class.java)
            startActivity(intent)
        }
    }
    }
