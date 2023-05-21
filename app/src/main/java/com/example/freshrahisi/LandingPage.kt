package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LandingPage: AppCompatActivity() {
    private lateinit var btnManage:Button
    private lateinit var btnAdd:Button
    private lateinit var btnAddProduct:Button
    private lateinit var btnCheck:Button
    private lateinit var btnView:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)
        btnManage=findViewById(R.id.btnManage)
        btnAdd=findViewById(R.id.btnAdd)
        btnAddProduct=findViewById(R.id.btnAddproduct)
        btnCheck=findViewById(R.id.btnCheck)
        btnView=findViewById(R.id.btnView)
        btnManage.setOnClickListener {
            val intent = Intent(this,ManageOrders::class.java)
            startActivity(intent)
        }
        btnAdd.setOnClickListener {
            val intent=Intent(this,AddCategory::class.java)
            startActivity(intent)
        }
        btnAddProduct.setOnClickListener {
            val intent=Intent(this,AddProduct::class.java)
            startActivity(intent)
        }
        btnCheck.setOnClickListener {
            val intent=Intent(this,Feedback::class.java)
            startActivity(intent)
        }
        btnView.setOnClickListener {
            val intent=Intent(this,Products::class.java)
            startActivity(intent)
        }
    }
}