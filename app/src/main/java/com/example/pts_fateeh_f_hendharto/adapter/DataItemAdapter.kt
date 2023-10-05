package com.example.pts_fateeh_f_hendharto.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.pts_fateeh_f_hendharto.R
import com.example.pts_fateeh_f_hendharto.databinding.ItemListItemBinding
import com.example.pts_fateeh_f_hendharto.model.DataItem

class DataItemAdapter (private val data:ArrayList<DataItem>)
    : RecyclerView.Adapter<DataItemAdapter.DataItemViewHolder>() {
        inner class DataItemViewHolder(val itemListBinding: ItemListItemBinding)
            : RecyclerView.ViewHolder(itemListBinding.root)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DataItemViewHolder (
            DataBindingUtil.inflate(LayoutInflater.from(parent.context),
            R.layout.item_list_item, parent, false)
        )

        override fun getItemCount(): Int = data.size

        override fun onBindViewHolder(holder: DataItemViewHolder, position: Int) {
            holder.itemListBinding.tvItemName.text = data[position].name
            holder.itemListBinding.ivItemImage.setImageResource(data[position].image)
            holder.itemListBinding.tvItemComment.text = data[position].comment
            holder.itemListBinding.tvItemRating.text = data[position].rating
        }
}