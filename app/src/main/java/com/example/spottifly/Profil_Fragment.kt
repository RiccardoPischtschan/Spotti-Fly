package com.example.spottifly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.spottifly.databinding.FragmentProfilBinding

class Profil_Fragment : Fragment() {
    private var _binding: FragmentProfilBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfilBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.profilBackButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigateUp()
        }
        binding.profilHomeButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.home_Fragment)
        }
        binding.profilSearchButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.suche_Fragment)
        }
    }
}
