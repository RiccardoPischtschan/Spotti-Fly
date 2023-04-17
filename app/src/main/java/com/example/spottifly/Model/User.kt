package com.example.spottifly.Model

data class User(
    val id: Int,
    val name: String,
    val email: String,
    val passwort: String,
    val profilImage: Int,
    var follower: Int,
    val chat: MutableList<String>,
    val beitraege: MutableList<Beitrag>,
    var follow: Boolean = false

)
