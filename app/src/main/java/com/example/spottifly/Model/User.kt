package com.example.spottifly.Model

data class User(
    val id: Int,
    val name: String,
    val email: String,
    val passwort: String,
    val profilImage: Int,
    val follower: Int,
    val chat: MutableList<String>,
    val beitragZaehler: Int,
    val beitraege: Beitrag

)
