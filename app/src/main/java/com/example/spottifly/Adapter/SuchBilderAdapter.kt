package com.example.spottifly.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Model.Beitrag
import com.example.spottifly.databinding.SucheBilderItemBinding

class SuchBilderAdapter(var beitragList: List<Beitrag>) : RecyclerView.Adapter<SuchBilderAdapter.SuchBilderHolder>() {

    class SuchBilderHolder(val binding: SucheBilderItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(beitrag: Beitrag) {
            binding.searchAccUploads.setImageResource(beitrag.beitragImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuchBilderHolder {
        val binding = SucheBilderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SuchBilderHolder(binding)
    }

    override fun getItemCount(): Int {
        return beitragList.size
    }

    override fun onBindViewHolder(holder: SuchBilderHolder, position: Int) {
        holder.bind(beitragList.get(position))
    }
}
