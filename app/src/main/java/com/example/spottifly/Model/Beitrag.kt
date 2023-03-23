package com.example.spottifly.Model

data class Beitrag(
    val beitragImage: Int,
    val like: Int,
    val airport: String,
    val airplane: String,
    val bildKommentar: String,
    val kommentare: MutableList<String>

)
