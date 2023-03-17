package com.example.spottifly.Adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Model.User
import com.example.spottifly.R
import com.example.spottifly.databinding.PostItemBinding

class HomeAdapter() : RecyclerView.Adapter<HomeAdapter.UserHolder>() {

    private var dataset = listOf<User>()
    class UserHolder(val binding: PostItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.homeUserImage.setImageResource(user.profilImage)
            binding.homeUserName.text = user.name
            binding.homeLikeCounterText.text = "${user.beitraege.like} Gefällt es"
            binding.homeAircraftTypText.text = user.beitraege.airplane
            binding.homePostText.text = user.beitraege.bildKommentar
            binding.homeImageView.setImageResource(user.beitraege.beitragImage)

            binding.homeLikeButton.setOnClickListener {
            }
            binding.homeKommentarButton.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.kommentar_Fragment)
            }

            val bundle = Bundle()
            bundle.putInt("userId", user.id)
            binding.homeUserImage.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.account_Fragment, bundle)
            }
        }
    }
    fun submitList(list: List<User>) {
        dataset = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val binding = PostItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserHolder(binding)
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.bind(dataset.get(position))
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}
