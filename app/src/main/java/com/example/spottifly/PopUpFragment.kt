package com.example.spottifly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.spottifly.databinding.FragmentPopUpBinding

class PopUpFragment : DialogFragment(R.layout.fragment_pop_up) {

    private var _binding: FragmentPopUpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPopUpBinding.inflate(inflater, container, false)

        val view = binding.root
        return view
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }
    fun onClose() {
        dismiss()
    }
}
