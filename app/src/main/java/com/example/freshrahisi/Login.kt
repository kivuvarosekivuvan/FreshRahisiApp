package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Login : AppCompatActivity() {
    lateinit var btnSignup1: Button
    lateinit var btnLogIn: Button
    lateinit var tilEmail: TextInputLayout
    lateinit var tilPassword: TextInputLayout
    lateinit var etEmail: TextInputEditText
    lateinit var etPassword: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btnSignup1 = findViewById(R.id.btnSignup1)
        btnSignup1.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
        btnLogIn = findViewById(R.id.btnLogIn)
        btnLogIn.setOnClickListener {


            val intent1 = Intent(this, Category::class.java)
            startActivity(intent1)

        }

        }
    }
