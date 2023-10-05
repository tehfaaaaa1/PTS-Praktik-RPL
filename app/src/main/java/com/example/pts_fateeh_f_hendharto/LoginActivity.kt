package com.example.pts_fateeh_f_hendharto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val cinUsername : EditText = findViewById(R.id.cinUsername)
        val cinPass : EditText = findViewById(R.id.cinPass)
        val btnSignIn : Button = findViewById(R.id.btnSignIn)
        val incorrectPass : TextView = findViewById(R.id.incorrectPass)
        val user1 = listOf("siswa","123")
        val user2 = listOf("siswa2", "1234")
        var intent = Intent(this, DashboardMenuActivity::class.java)

        btnSignIn.setOnClickListener {
            if (cinUsername.text.toString() == user1[0] && cinPass.text.toString() == user1[1]) {
                Toast.makeText(
                    this, "LOGIN SUCCESS", Toast.LENGTH_SHORT
                ).show()
                incorrectPass.visibility = View.INVISIBLE
                startActivity(intent)
                finish()
            } else if (cinUsername.text.toString() == user2[0]
                && cinPass.text.toString() == user2[1]){
                Toast.makeText(
                    this, "LOGIN SUCCESS", Toast.LENGTH_SHORT
                ).show()
                incorrectPass.visibility = View.INVISIBLE
                startActivity(intent)
                finish()
            } else if (cinUsername.text.toString().isEmpty()
                && cinPass.text.toString().isEmpty()) {
                incorrectPass.text = "Username or Password is Required"
                incorrectPass.visibility = View.VISIBLE
            }
            else {
                incorrectPass.text = "Username or password is incorrect.\nPlease try again."
                incorrectPass.visibility = View.VISIBLE
            }
        }
    }
}