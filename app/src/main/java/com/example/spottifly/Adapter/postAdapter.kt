package com.example.spottifly.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Home_Fragment
import com.example.spottifly.Model.User
import com.example.spottifly.databinding.PostItemBinding

abstract class PostAdapter(var user: ArrayList<User>) : RecyclerView.Adapter<PostAdapter.UserHolder>() {
    class UserHolder(val binding: PostItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.homeUserImage.imageAlpha = user.profilImage
            binding.homeUserName.text = user.name
            binding.homeLikeCounterText.text = user.beitraege.like.toString()
            binding.homeAircraftTypText.text = user.beitraege.airplane
            binding.homePostText.text = user.beitraege.bildKommentar
            binding.homeKommentarButton.findNavController().navigate()
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val binding = PostItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserHolder(binding)
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int, payloads: MutableList<Any>) {
        holder.bind(user.get(position))
    }

    override fun getItemCount(): Int {
        return user.size
    }
}
