package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ManageOrders : AppCompatActivity() {
    lateinit var btnCustomerA:Button
    lateinit var btnCustomerB:Button
    lateinit var btnCustomerC:Button
    lateinit var btnCustomerD:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_orders)
        btnCustomerA=findViewById(R.id.btnCustomerA)
        btnCustomerB=findViewById(R.id.btnCustomerB)
        btnCustomerC=findViewById(R.id.btnCustomerC)
        btnCustomerD=findViewById(R.id.btnCustomerD)
        btnCustomerA.setOnClickListener {
            val intent=Intent(this,Customer::class.java)
            startActivity(intent)
        }
        btnCustomerB.setOnClickListener {
            val intent=Intent(this,Customer::class.java)
            startActivity(intent)
        }
        btnCustomerC.setOnClickListener {
            val intent=Intent(this,Customer::class.java)
            startActivity(intent)
        }
        btnCustomerD.setOnClickListener {
            val intent=Intent(this,Customer::class.java)
            startActivity(intent)
        }
    }
}



