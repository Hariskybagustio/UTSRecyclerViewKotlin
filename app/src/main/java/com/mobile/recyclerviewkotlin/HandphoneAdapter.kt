package com.mobile.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HandphoneAdapter(private val context: Context, private val handphone: List<Handphone>, val listener: (Handphone) -> Unit)
    : RecyclerView.Adapter<HandphoneAdapter.HandphoneViewHolder>(){

    class HandphoneViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgHandphone = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameHandphone= view.findViewById<TextView>(R.id.tv_item_name)
        val descHandphone = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(handphone: Handphone, listener: (Handphone) -> Unit){
            imgHandphone.setImageResource(handphone.imgHandphone)
            nameHandphone.text = handphone.nameHandphone
            descHandphone.text = handphone.descHandphone
            itemView.setOnClickListener{
                (listener(handphone))
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HandphoneViewHolder {
        return HandphoneViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_handphone, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HandphoneViewHolder, position: Int) {
     holder.bindView(handphone[position], listener)
    }

    override fun getItemCount(): Int = handphone.size
    }


