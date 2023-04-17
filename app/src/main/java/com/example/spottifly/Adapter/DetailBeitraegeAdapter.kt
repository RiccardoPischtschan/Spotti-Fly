package com.example.spottifly.Adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Model.Beitrag
import com.example.spottifly.Model.User
import com.example.spottifly.R
import com.example.spottifly.databinding.DetailBeitraegeItemBinding

class DetailBeitragAdapter() : RecyclerView.Adapter<DetailBeitragAdapter.DetailBeitragHolder>() {

    private var dataset = listOf<Beitrag>()
    lateinit var account: User
    class DetailBeitragHolder(val binding: DetailBeitraegeItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(beitrag: Beitrag, account: User) {
            binding.detailProfilImage.setImageResource(account.profilImage)
            binding.detailUserName.text = account.name
            binding.detailAircraftTypText.text = beitrag.airplane
            binding.detailPostText.text = beitrag.bildKommentar
            binding.detailImage.setImageResource(beitrag.beitragImage)

            val bundle = Bundle()
            bundle.putInt("kommentarId", account.id)
            bundle.putInt("beitragId", beitrag.id)
            binding.detailKommentarButton.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.kommentar_Fragment,bundle)
            }
        }
    }
    fun submitUser(user: User) {
        dataset = user.beitraege
        account = user
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
        holder.bind(dataset.get(position), account)
    }
}
