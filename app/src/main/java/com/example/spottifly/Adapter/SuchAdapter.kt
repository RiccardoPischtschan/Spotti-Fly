package com.example.spottifly.Adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Model.User
import com.example.spottifly.R
import com.example.spottifly.databinding.SuchItemBinding

class SuchAdapter() : RecyclerView.Adapter<SuchAdapter.SuchHolder>() {
    private var dataset = listOf<User>()
    class SuchHolder(val binding: SuchItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(user: User) {
            binding.searchProfilImage.setImageResource(user.profilImage)
            binding.searchAccName.text = user.name
            val beitragListe = user.beitraege
            val bilderAdapter = SuchBilderAdapter(beitragListe)
            binding.searchAccBilderRecycler.adapter = bilderAdapter
            val bundle = Bundle()
            bundle.putInt("userId", user.id)
            binding.searchAccName.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.account_Fragment, bundle)
            }
        }
    }

    fun submitList(user: List<User>) {
        dataset = user
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuchHolder {
        val binding = SuchItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SuchHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: SuchHolder, position: Int) {
        holder.bind(dataset.get(position))
    }
}
