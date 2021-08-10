package com.example.desafiostant.utils

import com.example.desafiostant.data.model.Genre
import com.example.desafiostant.data.model.GenreResponse
import com.example.desafiostant.data.model.Movie
import com.example.desafiostant.data.model.MovieResponse

class Utils {

    companion object{
        fun toGenre(id: Int): String{
            return when(id) {
                28 -> "Action"
                12 -> "Adventure"
                16 -> "Animation"
                35 -> "Comedy"
                80 -> "Crime"
                99 -> "Documentary"
                18 -> "Crime"
                16 -> "Drama"
                10751 -> "Family"
                14 -> "Fantasy"
                36 -> "History"
                27 -> "Horror"
                10402 -> "Music"
                9648 -> "Mystery"
                10749 -> "10749"
                878 -> "Science Fiction"
                10770 -> "TV Movie"
                53 -> "Thriller"
                10752 -> "War"
                37 -> "Western"
                else -> "No Gender"
            }
        }
    }

}