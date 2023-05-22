package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Products : AppCompatActivity() {
    lateinit var btnAdd1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        btnAdd1=findViewById(R.id.btnAdd1)
        val intent = Intent(this,AddProduct::class.java)
        startActivity(intent)
    }
}


