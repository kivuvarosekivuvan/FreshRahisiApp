package com.example.freshrahisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Categories : AppCompatActivity() {

    lateinit var ivLogo : ImageView
    lateinit var tvCategories : TextView
    lateinit var ivVegetables : ImageView
    lateinit var ivFruits : ImageView
    lateinit var ivCereals : ImageView
    lateinit var ivSpices : ImageView
    lateinit var tvVegetables : TextView
    lateinit var tvFruits : TextView
    lateinit var tvCereals : TextView
    lateinit var tvSpices : TextView
    lateinit var btnReviews : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        tvVegetables = findViewById(R.id.tvVegetables)
        tvVegetables.setOnClickListener {
            val intent = Intent(this,Vegetables::class.java)
            startActivity(intent)
        }
        tvFruits = findViewById(R.id.tvFruits)
        tvFruits.setOnClickListener {
            val intent2 = Intent(this,fruits::class.java)
            startActivity(intent2)
        }
        tvCereals = findViewById(R.id.tvCereals)
        tvCereals.setOnClickListener {
            val intent3 = Intent(this,Cereals::class.java)
            startActivity(intent3)
        }
        tvSpices = findViewById(R.id.tvSpices)
        tvSpices.setOnClickListener {
            val intent4  = Intent(this,Spices::class.java)
            startActivity(intent4)
        }
    }



}

