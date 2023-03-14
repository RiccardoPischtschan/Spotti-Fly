package com.example.spottifly.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.spottifly.Model.User
import com.example.spottifly.R
import com.example.spottifly.databinding.PostItemBinding

class PostAdapter(var user: ArrayList<User>) : RecyclerView.Adapter<PostAdapter.UserHolder>() {
    class UserHolder(val binding: PostItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(user: User) {
            binding.homeUserImage.imageAlpha = user.profilImage
            binding.homeUserName.text = user.name
            binding.homeLikeCounterText.text = user.beitraege.like.toString()
            binding.homeAircraftTypText.text = user.beitraege.airplane
            binding.homePostText.text = user.beitraege.bildKommentar

            binding.homeLikeButton.setOnClickListener {
            }
            binding.homeKommentarButton.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.kommentar_Fragment)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val binding = PostItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserHolder(binding)
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.bind(user.get(position))
    }
    override fun getItemCount(): Int {
        return user.size
    }
}
