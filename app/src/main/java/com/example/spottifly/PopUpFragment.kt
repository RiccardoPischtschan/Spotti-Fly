package com.example.spottifly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import coil.load
import com.example.spottifly.Api.WeatherApi
import com.example.spottifly.databinding.FragmentPopUpBinding
import kotlinx.coroutines.launch

class PopUpFragment : DialogFragment(R.layout.fragment_pop_up) {

    private var _binding: FragmentPopUpBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_FRAME, androidx.appcompat.R.style.Base_Theme_AppCompat_Dialog)
        val city = requireArguments().getString("aiport", "")
        lifecycleScope.launch {
            val weatherData = WeatherApi.retrofitService.getWeatherData(
                viewModel.currentCity,
                "9dbc456b1289a8b7e39ce517b5f9ef2a"
            )
            val data = weatherData.body()
            if (data != null) {
                var temp = data.main.temp - 273.15
                val round = String.format("%.1f", temp)
                binding.textTemperature.text = "$round °C"
                val uri = data.weather[0].icon.toUri().buildUpon().scheme("https").build()
                binding.imageWeatherIcon.load(uri) {
                    crossfade(true)
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPopUpBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
}
