package com.example.insgram

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView


class newadapter (var list:ArrayList<mydata>):RecyclerView.Adapter<newadapter.Viewholder>(){
    class Viewholder(ItemView: View):RecyclerView.ViewHolder(ItemView) {
        val img1:ImageView=itemView.findViewById(R.id.img1)
        val img2:ImageView=itemView.findViewById(R.id.img2)
        val imgggg:ImageView=itemView.findViewById(R.id.img3)
        val txt:TextView=itemView.findViewById(R.id.tv1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): newadapter.Viewholder {
        return Viewholder(LayoutInflater.from(parent.context).inflate(R.layout.myrec1,parent,false))
    }

    override fun onBindViewHolder(holder: newadapter.Viewholder, position: Int) {
        holder.img1.setImageResource(list[position].img1)
        holder.txt.text=list[position].txt
        holder.img2.setImageResource(list[position].img2)



        holder.img2.setOnClickListener(){
           var bundle=Bundle()
            bundle.putInt("img",list[position].img2)
            var fra=fourFragment()
            fra.arguments=bundle

            val fragmentManager = (holder.itemView.context as FragmentActivity).supportFragmentManager
                 fragmentManager.beginTransaction().replace(R.id.fl1,fra).addToBackStack(null).commit()


        }

        holder.imgggg.setOnClickListener(){

          holder.imgggg.setImageResource(R.drawable.like4)

                holder.imgggg.setOnClickListener() {


        }

        }
    }

    override fun getItemCount(): Int {
       return  list.size
    }
}