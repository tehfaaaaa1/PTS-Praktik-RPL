package com.example.pts_fateeh_f_hendharto

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var splashLogo:ImageView = findViewById(R.id.splashLogo)
        var splashTitle: TextView = findViewById(R.id.splashTitle)

        Handler().postDelayed({
            splashLogo.visibility = View.VISIBLE
            splashTitle.visibility = View.VISIBLE
        }, 2500)
        Handler().postDelayed({
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}