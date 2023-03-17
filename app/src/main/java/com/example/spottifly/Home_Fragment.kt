package com.example.spottifly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.spottifly.Adapter.HomeAdapter
import com.example.spottifly.databinding.FragmentHomeBinding

class Home_Fragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val postAdapter = HomeAdapter()
        binding.homePostRecycler.adapter = postAdapter

        viewModel.user.observe(viewLifecycleOwner) {
            postAdapter.submitList(it)

            binding.homeProfilButton.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.profil_Fragment)
            }
        }
    }
}
