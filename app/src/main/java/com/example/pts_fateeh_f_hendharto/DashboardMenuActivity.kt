package com.example.pts_fateeh_f_hendharto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pts_fateeh_f_hendharto.adapter.DataItemAdapter
import com.example.pts_fateeh_f_hendharto.databinding.ActivityDashboardMenuBinding
import com.example.pts_fateeh_f_hendharto.databinding.ItemListItemBinding
import com.example.pts_fateeh_f_hendharto.model.DataItem

class DashboardMenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dashboard_menu)

//      Tampilkan notif ketika pencet notif
        val notif = binding.notif
        val cvNotif = binding.cvNotif
        notif.setOnClickListener {
            if (cvNotif.visibility == View.GONE) {
                cvNotif.visibility = View.VISIBLE
            }
            else {
                cvNotif.visibility == View.GONE
            }
        }
//        DATA BINDING UNTUK RECYCLER VIEW
//        ENTAH MENGAPA SAYA MELAKUKAN INI
        val listItem = arrayListOf<DataItem>(
            DataItem("Macbook Pro 13 M2 Chip", R.drawable.pic1, "15", "4.6"),
            DataItem("PS5 Pro Max Ultimate", R.drawable.pic2, "10", "4.2"),
            DataItem("iPhone Huhuy", R.drawable.pic3, "99", "4.1")
        )

        val adapter = DataItemAdapter(listItem)
        val recyclerView = binding.rvPopularProduct

        recyclerView.apply {
            this.adapter = adapter
            this.layoutManager = LinearLayoutManager(
                this@DashboardMenuActivity, LinearLayoutManager.HORIZONTAL, false)
        }


    }
}