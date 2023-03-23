package com.example.spottifly.Adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Model.Beitrag
import com.example.spottifly.Model.User
import com.example.spottifly.R
import com.example.spottifly.databinding.PostItemBinding

class HomeAdapter() : RecyclerView.Adapter<HomeAdapter.UserHolder>() {

    private var beitragList = listOf<Beitrag>()
    private var userList = listOf<User>()
    class UserHolder(val binding: PostItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(beitrag: Beitrag, user: User) {
            binding.homeUserImage.setImageResource(user.profilImage)
            binding.homeUserName.text = user.name
            binding.homeLikeCounterText.text = "${beitrag.like} Gefällt es"
            binding.homeAircraftTypText.text = beitrag.airplane
            binding.homePostText.text = beitrag.bildKommentar
            binding.homeImageView.setImageResource(beitrag.beitragImage)

            binding.homeLikeButton.setOnClickListener {
            }
            val bundle = Bundle()
            bundle.putInt("kommentarId", user.id)
            binding.homeKommentarButton.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.kommentar_Fragment, bundle)
            }

            bundle.putInt("userId", user.id)
            binding.homeUserImage.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.account_Fragment, bundle)
            }
            var isLiked = false
            binding.homeLikeButton.setOnClickListener {
                isLiked = !isLiked
                if (isLiked) {
                    binding.homeLikeButton.setImageResource(R.drawable.heart)
                } else {
                    binding.homeLikeButton.setImageResource(R.drawable.heartfull)
                }
            }
        }
    }
    fun submitList(list: List<User>) {
        var postList: MutableList<Beitrag> = mutableListOf()
        var userPostList: MutableList<User> = mutableListOf()
        for (user in list) {
            postList.addAll(user.beitraege)
            for (i in 1..user.beitraege.size) {
                userPostList.add(user)
            }
        }
        userList = userPostList
        beitragList = postList
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val binding = PostItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserHolder(binding)
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.bind(beitragList.get(position), userList.get(position))
    }

    override fun getItemCount(): Int {
        return beitragList.size
    }
}
