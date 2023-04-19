package com.example.spottifly.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Model.Beitrag
import com.example.spottifly.Model.User
import com.example.spottifly.databinding.KommentarItemBinding

class KommentarAdapter() : RecyclerView.Adapter<KommentarAdapter.KommentarHolder>() {

    private var dataset = listOf<Beitrag>()
    private lateinit var account: User
    class KommentarHolder(val binding: KommentarItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(beitrag: Beitrag) {
        }
    }
    fun submitUser(user: User) {
        dataset = user.beitraege
        account = user
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KommentarHolder {
        val binding = KommentarItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return KommentarHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: KommentarHolder, position: Int) {
        holder.bind(dataset.get(position))
    }
}
