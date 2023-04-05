package com.example.spottifly.Api

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class WeatherRepository(private val api: WeatherApi) {

    private val _weatherData = MutableLiveData<WeatherData>()
    val weatherData: LiveData<WeatherData>
        get() = _weatherData
}
