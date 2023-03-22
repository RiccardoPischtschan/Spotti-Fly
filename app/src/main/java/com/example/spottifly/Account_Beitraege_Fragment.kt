package com.example.spottifly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.spottifly.Adapter.DetailBeitragAdapter
import com.example.spottifly.databinding.FragmentAccountBeitraegeBinding

class Account_Beitraege_Fragment : Fragment() {
    private var _binding: FragmentAccountBeitraegeBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAccountBeitraegeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val accId = requireArguments().getInt("accId")

        val detailBeitragAdapter = DetailBeitragAdapter()
        binding.detailBeitraegeRecycler.adapter = detailBeitragAdapter

        viewModel.user.observe(viewLifecycleOwner) {
            detailBeitragAdapter.submitList(it)
        }
        binding.detailBackButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigateUp()
        }
        binding.detailHomeButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.home_Fragment)
        }
        binding.detailSearchButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.suche_Fragment)
        }
    }
}
