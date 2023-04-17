package com.example.spottifly

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation
import com.example.spottifly.Adapter.HomeAdapter
import com.example.spottifly.Api.WeatherApi
import com.example.spottifly.Api.WeatherData
import com.example.spottifly.databinding.FragmentHomeBinding
import kotlinx.coroutines.launch
import retrofit2.Response

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
        val postAdapter = HomeAdapter(viewModel.changeCity)
        binding.homePostRecycler.adapter = postAdapter

        viewModel.user.observe(viewLifecycleOwner) {
            postAdapter.submitList(it.shuffled())

            binding.homeProfilButton.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.profil_Fragment)
            }
            binding.homeSearchButton.setOnClickListener {
                Navigation.findNavController(binding.root).navigate(R.id.suche_Fragment)
            }
            binding.homeMessageButton.setOnClickListener {
                lifecycleScope.launch {
                    val weatherData: Response<WeatherData> = WeatherApi.retrofitService.getWeatherData("München", "9dbc456b1289a8b7e39ce517b5f9ef2a")
                    println(weatherData.body().toString())
                }
            }
        }
    }
}
