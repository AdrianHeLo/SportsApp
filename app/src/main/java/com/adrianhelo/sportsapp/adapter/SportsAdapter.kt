package com.adrianhelo.sportsapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.adrianhelo.sportsapp.R
import com.adrianhelo.sportsapp.model.SportsModel

class SportsAdapter(private var itemList: ArrayList<SportsModel>):
    RecyclerView.Adapter<SportsAdapter.SportsViewHolder>() {

    inner class SportsViewHolder(private val itemView: View): RecyclerView.ViewHolder(itemView){

        val itemName: TextView
        val itemImage: ImageView

        init {
            itemName = itemView.findViewById(R.id.text_card_view)
            itemImage = itemView.findViewById(R.id.image_card_view)
            itemView.setOnClickListener{
                Toast.makeText(itemView.context, "${itemList[layoutPosition].sportsName} clicked!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sports_card_item, parent, false)
        return SportsViewHolder(view)
    }

    override fun onBindViewHolder(holder: SportsViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].sportsImage)
        holder.itemName.text = itemList[position].sportsName
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}