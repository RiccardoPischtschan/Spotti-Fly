package com.example.spottifly

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.spottifly.Api.WeatherApi
import com.example.spottifly.Api.WeatherData
import com.example.spottifly.Api.WeatherRepository
import com.example.spottifly.Model.Beitrag
import com.example.spottifly.Model.Repository
import com.example.spottifly.Model.User

class MainViewModel : ViewModel() {

    private val repository = Repository()
    private val weatherRepository = WeatherRepository(WeatherApi)

    val weatherData: LiveData<WeatherData> = weatherRepository.weatherData
    var currentCity: String = ""
    private val _user = MutableLiveData<List<User>>()
    val user: LiveData<List<User>>
        get() = _user

    private val _beitraege = MutableLiveData<MutableList<Beitrag>>()
    val beitraege: LiveData<MutableList<Beitrag>>
        get() = _beitraege

    private val _account = MutableLiveData<User>()
    val account: LiveData<User>
        get() = _account

    private val _searchResults = MutableLiveData<List<User>?>(repository.userList().shuffled())
    val searchResult: MutableLiveData<List<User>?>
        get() = _searchResults

    init {
        _user.value = repository.userList()
    }

    fun setAccount(user: User) {
        _account.value = user
    }

    fun search(term: String) {
        val filterList = _searchResults.value?.filter {
            it.name.contains(term)
        }
        _searchResults.value = filterList
    }
    fun resetList() {
        _searchResults.value = repository.userList()
    }
    val changeCity: (String) -> Unit = {
        currentCity = it
    }
}
