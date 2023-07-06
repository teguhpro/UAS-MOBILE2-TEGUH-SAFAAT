package com.example.uas_mobile2_teguh_safaat.services

import com.example.uas_mobile2_teguh_safaat.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=90815fba49dc64faccc22cbef96a0934")
    fun getMovieList(): Call<MovieResponse>
}