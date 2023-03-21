package com.example.spottifly.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Model.Beitrag
import com.example.spottifly.Model.User
import com.example.spottifly.databinding.DetailBeitraegeItemBinding

class DetailBeitragAdapter() : RecyclerView.Adapter<DetailBeitragAdapter.DetailBeitragHolder>() {

    private var dataset = listOf<User>()
    class DetailBeitragHolder(val binding: DetailBeitraegeItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(user: User) {
            binding.detailProfilImage.setImageResource(user.profilImage)
            binding.detailUserName.text = user.name
            binding.detailAircraftTypText.text = user.beitraege.airplane
            binding.detailPostText.text = user.beitraege.bildKommentar
        }
    }
    fun submitList(list: List<User>) {
        dataset = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailBeitragHolder {
        val binding = DetailBeitraegeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DetailBeitragHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: DetailBeitragHolder, position: Int) {
        holder.bind(dataset.get(position))
    }
}
