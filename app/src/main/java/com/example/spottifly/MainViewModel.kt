package com.example.spottifly

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.spottifly.Model.Beitrag
import com.example.spottifly.Model.Repository
import com.example.spottifly.Model.User

class MainViewModel : ViewModel() {

    private val repository = Repository()

    private val _user = MutableLiveData<List<User>>()
    val user: LiveData<List<User>>
        get() = _user

    private val _beitraege = MutableLiveData<MutableList<Beitrag>>()
    val beitraege: LiveData<MutableList<Beitrag>>
        get() = _beitraege

    private val _account = MutableLiveData<User>()
    val account: LiveData<User>
        get() = _account

    init {
        _user.value = repository.userList()
    }

    fun setAccount(user: User) {
        _account.value = user
    }

    fun search(term: String) {

    }
}
