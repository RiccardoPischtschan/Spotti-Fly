package com.example.spottifly.Model

data class Beitrag(
    val id: Int,
    val beitragImage: Int,
    var like: Int,
    val airport: String,
    val airplane: String,
    val bildKommentar: String,
    val kommentare: MutableList<String>,
    var isLike: Boolean = false

)
