package com.example.pts_fateeh_f_hendharto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pts_fateeh_f_hendharto.adapter.DataItemAdapter
import com.example.pts_fateeh_f_hendharto.databinding.ItemListItemBinding
import com.example.pts_fateeh_f_hendharto.model.DataItem

class DashboardMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ItemListItemBinding = ItemListItemBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var rvPopularProduct: RecyclerView = findViewById(R.id.rvPopularProduct)

        val listItem = arrayListOf<DataItem>(
            DataItem("Macbook Pro 13 M2 Chip", R.drawable.pic1, "15", "4.6"),
            DataItem("PS5 Pro Max Ultimate", R.drawable.pic2, "10", "4.2"),
            DataItem("iPhone Huhuy", R.drawable.pic3, "99", "4.1")
        )

        val adapter = DataItemAdapter(listItem)
        val linearHorizontal = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)

        rvPopularProduct.adapter = adapter
        rvPopularProduct.layoutManager = linearHorizontal

    }
}