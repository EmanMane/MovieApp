package com.example.movieapp

data class Movie(
    val id: Long,
    val title: String,
    val overview: String,
    val releaseDate: String,
    val homepage: String,
    val genre: String,
    val actors: List<String>,
    val similar: List<String>
)