package com.example.pts_fateeh_f_hendharto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import kotlin.time.measureTimedValue

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val numberItemTxt: TextView = findViewById(R.id.numberItemTxt)
        val btnPlus: ImageButton = findViewById(R.id.plusBtn)
        val btnMinus: ImageButton = findViewById(R.id.minusBtn)
        val tvTotal: TextView = findViewById(R.id.tvTotal)
        val tvSubtotal: TextView = findViewById(R.id.tvSubtotal)
        var angka = 0
        var harga:Int = 1347
        val delivery: Int = 5

        btnPlus.setOnClickListener {
            angka += 1
            numberItemTxt.text = angka.toString()
            tvSubtotal.text = (angka*harga).toString()
            tvTotal.text = (angka*harga+5).toString()
        }
        btnMinus.setOnClickListener {
            angka -= 1
            numberItemTxt.text = angka.toString()
            tvSubtotal.text = (angka*harga).toString()
            tvTotal.text = (angka*harga+5).toString()
        }
    }
}