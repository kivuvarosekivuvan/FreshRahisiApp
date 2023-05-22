package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Signup : AppCompatActivity() {
            lateinit var btnBack: Button
            lateinit var tilFirstName: TextInputLayout
            lateinit var tilLastName: TextInputLayout
            lateinit var tilEmail: TextInputLayout
            lateinit var tilPassword: TextInputLayout
            lateinit var tilConfirmPassword: TextInputLayout
            lateinit var etFirstName: TextInputEditText
            lateinit var etLastName: TextInputEditText
            lateinit var etEmail: TextInputEditText
            lateinit var etPassword: TextInputEditText
            lateinit var etConfirmPassword: TextInputEditText
            lateinit var btnSignup: Button


            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_signup)

            }

            override fun onResume() {
                super.onResume()
                btnBack.setOnClickListener {
                    val intent = Intent(this, Login::class.java)
                    startActivity(intent)

                }
                btnSignup.setOnClickListener {
                    clearErrors()
                    validateSignUp()
                }
            }


            fun validateSignUp() {
                val firstName = etFirstName.text.toString()
                val lastName = etLastName.text.toString()
                val email = etEmail.text.toString()
                val password = etPassword.text.toString()
                val confirmPassword = etConfirmPassword.text.toString()
                var error = false

                if (firstName.isBlank()) {
                    tilFirstName.error = "First name is required"
                    error = true
                }
                if (lastName.isBlank()) {
                    tilLastName.error = "Last name is required"
                    error = true
                }
                if (email.isBlank()) {
                    tilEmail.error = "Email is required"
                    error = true
                }
                if (password.isBlank()) {
                    tilPassword.error = "Password is required"
                    error = true
                }
                if (confirmPassword.isBlank()) {
                    tilConfirmPassword.error = "You need to confirm your password"
                    error = true
                }
                if (password != confirmPassword) {
                    tilConfirmPassword.error = "Password and confirmation does not match"
                    error = true
                }
                if (!error) {
                    Toast
                        .makeText(this, "$firstName $lastName $email", Toast.LENGTH_LONG).show()
                }

            }

            fun clearErrors() {
                tilFirstName.error = null
                tilLastName.error = null
                tilEmail.error = null
                tilPassword.error = null
                tilConfirmPassword.error = null


            }
        }


