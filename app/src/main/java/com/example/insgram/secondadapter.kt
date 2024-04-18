package com.example.insgram

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class secondadapter(var list2:ArrayList<mydata2>):RecyclerView.Adapter<secondadapter.Viewholder>() {
    class Viewholder(ItemView: View):RecyclerView.ViewHolder(ItemView) {
        val img5: ImageView =itemView.findViewById(R.id.img5)
        val txt5: TextView =itemView.findViewById(R.id.tv5)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): secondadapter.Viewholder {
        return Viewholder(LayoutInflater.from(parent.context).inflate(R.layout.myrec2,parent,false))
    }



    override fun onBindViewHolder(holder: secondadapter.Viewholder, position: Int) {
        holder.img5.setImageResource(list2[position].img5)

        holder.txt5.text=list2[position].txt5
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}