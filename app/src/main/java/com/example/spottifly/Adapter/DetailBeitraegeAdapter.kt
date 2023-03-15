package com.example.spottifly.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Model.User
import com.example.spottifly.databinding.DetailBeitraegeItemBinding

class DetailBeitragAdapter(var userList: ArrayList<User>) : RecyclerView.Adapter<DetailBeitragAdapter.DetailBeitragHolder>() {

    class DetailBeitragHolder(val binding: DetailBeitraegeItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(detail: User) {
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailBeitragHolder {
        val binding = DetailBeitraegeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DetailBeitragHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: DetailBeitragHolder, position: Int) {
        holder.bind(userList.get(position))
    }
}
