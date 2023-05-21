package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freshrahisi.databinding.ActivityLoginBinding


class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)       //this is important
        setContentView(binding.root)
        validateSignUp()
        clearErrors()



        binding.btnSignup1.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
        binding.btnLogIn.setOnClickListener {


            val intent1 = Intent(this, Category::class.java)
            startActivity(intent1)

        }

    }


    fun validateSignUp() {
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        var error = false

        if (email.isBlank()) {
            binding.tilEmail.error = "Email is required"
            error = true
        }
        if (password.isBlank()) {
            binding.tilPassword.error = "Password is required"
            error = true
        }

    }
    fun clearErrors(){
        binding.etEmail.error= null
        binding.etPassword.error= null

    }
}

