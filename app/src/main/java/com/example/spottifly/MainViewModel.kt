package com.example.spottifly

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.spottifly.Model.Repository
import com.example.spottifly.Model.User

class MainViewModel : ViewModel() {

    private val repository = Repository()

    private val _user = MutableLiveData<List<User>>()
    val user: LiveData<List<User>>
        get() = _user

    init {
        _user.value = repository.userList()
    }

    fun loadAccount(id: Int) {
        _user.value?.find { it.id == id }
    }
    fun loadAccountBeitrag(id: Int) {
        _user.value?.find { it.id == id }
    }
}
