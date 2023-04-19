package com.example.spottifly.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Model.Beitrag
import com.example.spottifly.Model.User
import com.example.spottifly.R
import com.example.spottifly.databinding.BeitraegeItemBinding

class BeitraegeAdapter() : RecyclerView.Adapter<BeitraegeAdapter.BeitraegeHolder>() {

    private var dataset = listOf<Beitrag>()
    private lateinit var account: User
    class BeitraegeHolder(val binding: BeitraegeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(beitrag: Beitrag) {
            binding.beitraegeImageAccount.setImageResource(beitrag.beitragImage)

            binding.beitraegeImageAccount.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.account_Beitraege_Fragment)
            }
        }
    }
    fun submitUser(user: User) {
        dataset = user.beitraege
        account = user
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeitraegeHolder {
        val binding = BeitraegeItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return BeitraegeHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: BeitraegeHolder, position: Int) {
        holder.bind(dataset.get(position))
    }
}
