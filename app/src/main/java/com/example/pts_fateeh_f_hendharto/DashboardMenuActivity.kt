package com.example.pts_fateeh_f_hendharto

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pts_fateeh_f_hendharto.adapter.DataItemAdapter
import com.example.pts_fateeh_f_hendharto.databinding.ActivityDashboardMenuBinding
import com.example.pts_fateeh_f_hendharto.databinding.ItemListItemBinding
import com.example.pts_fateeh_f_hendharto.model.DataItem

class DashboardMenuActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_menu)

//      Tampilkan notif ketika pencet notif
        val notif:ImageButton = findViewById(R.id.notif)
        val cvNotif:CardView = findViewById(R.id.cvNotif)
        notif.setOnClickListener {
            if (cvNotif.visibility == View.GONE) {
                cvNotif.visibility = View.VISIBLE
            }
            else {
                cvNotif.visibility = View.GONE
            }
        }

//      RPL SERU BANGET
        val listItem = listOf(
            DataItem("Macbook Pro 13 M2 Chip", R.drawable.pic1, "15", "4.6", "USD 1346,87"),
            DataItem("PS5 Pro Max Ultimate", R.drawable.pic2, "10", "4.2", "USD 399,99"),
            DataItem("iPhone Huhuy", R.drawable.pic3, "99", "4.1", "USD 1")
        )
        val adapter = DataItemAdapter(listItem)
        val recyclerView: RecyclerView = findViewById(R.id.rvPopularProduct)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.HORIZONTAL, false
        )
    }
}