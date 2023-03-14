package com.example.spottifly.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Model.User
import com.example.spottifly.databinding.SuchItemBinding

class SuchAdapter(var userList: ArrayList<User>) : RecyclerView.Adapter<SuchAdapter.SuchHolder>() {

    class SuchHolder(val binding: SuchItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(such: User) {
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuchHolder {
        val binding = SuchItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SuchHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: SuchHolder, position: Int) {
        holder.bind(userList.get(position))
    }
}
