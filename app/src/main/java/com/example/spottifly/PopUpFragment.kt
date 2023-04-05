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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_FRAME, androidx.appcompat.R.style.Base_Theme_AppCompat_Dialog)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pop_up, container, false)
    }
}
