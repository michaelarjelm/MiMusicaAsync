package com.example.mimusicaasync

data class Cancion(
    val titulo: String,
    val artista: String,
    val genero: String,
    var veces: Int
)