package com.example.spottifly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.spottifly.Adapter.BeitraegeAdapter
import com.example.spottifly.databinding.FragmentAccountBinding

class Account_Fragment : Fragment() {
    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAccountBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val userId = requireArguments().getInt("userId")

        val beitraegeAdapter = BeitraegeAdapter()
        binding.accBeitraegeRecycler.adapter = beitraegeAdapter

        viewModel.user.observe(viewLifecycleOwner) { list ->
            val user = list.find { it.id == userId }
            viewModel.setAccount(user!!)

            if (user != null) {
                binding.accProfilImageAccount.setImageResource(user.profilImage)
                binding.accUserName.text = user.name
                binding.accCounterBeitrGe.text = user.beitraege.size.toString()
                binding.accUserInfo1.text = " ${user.userInfo} "

                if (user.follow) {
                    binding.accFollowButton.text = "Gefolgen"
                    binding.accFollowerCounter.text = "${user.follower}"
                } else {
                    binding.accFollowButton.text = "Folgen"
                    binding.accFollowerCounter.text = "${user.follower}"
                }
                binding.accFollowButton.setOnClickListener {
                    user.follow = !user.follow
                    if (user.follow) {
                        user.follower += 1
                        binding.accFollowButton.text = "Gefolgt"
                        binding.accFollowerCounter.text = "${user.follower}"
                    } else {
                        user.follower -= 1
                        binding.accFollowButton.text = "Folgen"
                        binding.accFollowerCounter.text = "${user.follower}"
                    }
                }
            }
        }

        viewModel.account.observe(viewLifecycleOwner) {
            beitraegeAdapter.submitUser(it)
            // Log.d("userInfo", viewModel.user.value.toString())
        }
        binding.accHomeButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.home_Fragment)
        }
        binding.accSearchButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.suche_Fragment)
        }
    }
}
