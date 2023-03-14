package com.example.spottifly.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Model.User
import com.example.spottifly.databinding.SucheBilderItemBinding

class SuchBilderAdapter(var userList: ArrayList<User>) : RecyclerView.Adapter<SuchBilderAdapter.SuchBilderHolder>() {

    class SuchBilderHolder(val binding: SucheBilderItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(suchbild: User) {
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuchBilderHolder {
        val binding = SucheBilderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SuchBilderHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: SuchBilderHolder, position: Int) {
        holder.bind(userList.get(position))
    }
}
