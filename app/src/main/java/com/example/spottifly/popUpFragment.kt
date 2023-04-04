package com.example.spottifly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupWindow
import androidx.fragment.app.DialogFragment
import com.example.spottifly.databinding.FragmentPopUpBinding

class popUpFragment : DialogFragment() {

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
// Das Layout für das Popup-Fenster
        val binding = FragmentPopUpBinding.inflate(layoutInflater)

// PopupWindow erstellen
        val popupWindow = PopupWindow(
            binding.root, // Das Layout, das im PopupWindow angezeigt werden soll
            ViewGroup.LayoutParams.MATCH_PARENT, // Breite des PopupWindows
            ViewGroup.LayoutParams.MATCH_PARENT, // Höhe des PopupWindows
            true // true, wenn das PopupWindow durch Tippen außerhalb des Fensters geschlossen werden soll
        )
    }
}
