package com.example.spottifly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.spottifly.Adapter.KommentarAdapter
import com.example.spottifly.Model.Beitrag
import com.example.spottifly.databinding.FragmentKommentarBinding

class Kommentar_Fragment : Fragment() {
    private var _binding: FragmentKommentarBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()
    private lateinit var beitrag: Beitrag

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKommentarBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val kommentarId = requireArguments().getInt("kommentarId")
        val beitragId = requireArguments().getInt("beitragId")

        val kommentarAdapter = KommentarAdapter()
        binding.kommentarRecycler.adapter = kommentarAdapter

        viewModel.user.observe(viewLifecycleOwner) { list ->
            val user = list.find { it.id == kommentarId }

            if (user != null) {
                binding.kommentarUserImage.setImageResource(user.profilImage)
                binding.kommentarUserName.text = user.name
            }
        }

        viewModel.beitraege.observe(viewLifecycleOwner) { list ->
            val beitrag = list.find { it.id == beitragId }

            if (beitrag != null) {
                binding.kommentarPostText.text = beitrag.bildKommentar
            }
        }
        viewModel.account.observe(viewLifecycleOwner) {
            kommentarAdapter.submitUser(it)
        }

        binding.kommentarBackButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigateUp()
        }
        binding.kommentarHomeButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.home_Fragment)
        }
        binding.kommentarSearchButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.suche_Fragment)
        }
    }
}
