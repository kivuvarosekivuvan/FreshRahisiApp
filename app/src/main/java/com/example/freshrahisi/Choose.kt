package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Choose : AppCompatActivity() {
    lateinit var btnMama: Button
    lateinit var btnCustomer: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
        btnMama=findViewById(R.id.btnMama)
        btnMama.setOnClickListener {
            val intent = Intent(this,MamaMboga::class.java)
            startActivity(intent)
        }
        btnCustomer=findViewById(R.id.btnCustomer)
        btnCustomer.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}