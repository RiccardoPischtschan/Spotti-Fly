package com.example.spottifly.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Model.User
import com.example.spottifly.databinding.BeitraegeItemBinding

class BeitaegeAdapter(var userList: ArrayList<User>) : RecyclerView.Adapter<BeitaegeAdapter.BeitraegeHolder>() {

    class BeitraegeHolder(val binding: BeitraegeItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(bild: User) {
            binding.beitraegeImageAccount.imageAlpha = bild.beitraege.beitragImage
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeitraegeHolder {
        val binding = BeitraegeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BeitraegeHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: BeitraegeHolder, position: Int) {
        holder.bind(userList.get(position))
    }
}
