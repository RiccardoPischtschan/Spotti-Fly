package com.example.spottifly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.spottifly.Adapter.SuchAdapter
import com.example.spottifly.databinding.FragmentSucheBinding

class Suche_Fragment : Fragment() {
    private var _binding: FragmentSucheBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSucheBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val suchAdapter = SuchAdapter()
        binding.searchRecycler.adapter = suchAdapter

        viewModel.searchResult.observe(viewLifecycleOwner) { results ->
            if (results != null) {
                suchAdapter.submitList(results)
            }
        }
        binding.searchButton.setOnClickListener {
            viewModel.resetList()
            val term = binding.nameSearchEdit.text.toString()
            viewModel.search(term)
            binding.nameSearchEdit.setText("")
        }
        binding.searchHomeButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.home_Fragment)
        }
        binding.searchSearchButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.suche_Fragment)
        }
    }
}
