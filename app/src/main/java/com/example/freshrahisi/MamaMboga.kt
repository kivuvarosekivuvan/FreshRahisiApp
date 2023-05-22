package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MamaMboga : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var btnRegistration: Button
    lateinit var tilEmail:TextInputLayout
    lateinit var tilPassword:TextInputLayout
    lateinit var etEmail:TextInputEditText
    lateinit var etPassword:TextInputEditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mama_mboga)
        btnLogin=findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
          validation()
            clearErrors()
        }
        btnRegistration=findViewById(R.id.btnRegistration)
        btnRegistration.setOnClickListener {
            var intent= Intent( this, registration::class.java)
            startActivity(intent)
        }
    }
     fun validation(){
        val email=etEmail.text.toString()
        val password=etPassword.text.toString()
        var error=false

        if(email.isBlank()){
            tilEmail.error = "Please enter your Email"
            error = true
        }
        if(password.isBlank()){
            tilPassword.error = "Input your password"
            error = true
        }
        if(!error){
            var intent= Intent( this, LandingPage::class.java)
            startActivity(intent)
        }
    }
    fun clearErrors(){
        tilEmail.error = null
        tilPassword.error = null
    }

    }
