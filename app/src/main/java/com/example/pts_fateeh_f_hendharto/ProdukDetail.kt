package com.example.pts_fateeh_f_hendharto

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class ProdukDetail : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produk_detail)

        val ibSave: ImageButton = findViewById(R.id.ibSave)
        val ibShare: ImageButton = findViewById(R.id.ibShare)

        ibSave.setOnClickListener {
            ibSave.setImageResource(R.drawable.ic_saved)
            Toast.makeText(
                this, "Saved", Toast.LENGTH_SHORT
            ).show()
        }

        ibShare.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "OMG Macbook Pro-Chan \uD83D\uDE0B")
            intent.setType("text/plain")
            startActivity(Intent.createChooser(intent, "Share to an idiot: "))
        }

        val BuyNow: Button = findViewById(R.id.BuyNow)
        BuyNow.setOnClickListener {
            val intent = Intent(this,CartActivity::class.java)
            startActivity(intent)
        }
    }
}