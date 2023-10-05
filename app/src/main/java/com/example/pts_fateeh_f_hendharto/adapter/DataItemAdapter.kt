package com.example.pts_fateeh_f_hendharto.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pts_fateeh_f_hendharto.ProdukDetail
import com.example.pts_fateeh_f_hendharto.R
import com.example.pts_fateeh_f_hendharto.model.DataItem

class DataItemAdapter (private val data:List<DataItem>)
    : RecyclerView.Adapter<DataItemAdapter.DataItemViewHolder>() {

    class DataItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItemName : TextView = view.findViewById(R.id.tvItemName)
        val ivItemImage: ImageView = view.findViewById(R.id.ivItemImage)
        val tvItemRating: TextView = view.findViewById(R.id.tvItemRating)
        val tvItemComment: TextView = view.findViewById(R.id.tvItemComment)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_item,parent,false)
        return DataItemViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DataItemViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvItemName.text = item.name
        holder.ivItemImage.setImageResource(item.image)
        holder.tvItemComment.text = item.comment
        holder.tvItemRating.text = item.rating
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, ProdukDetail::class.java)
            holder.itemView.context.startActivity(intent)
        }
    }

}