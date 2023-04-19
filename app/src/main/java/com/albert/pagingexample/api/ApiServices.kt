package com.albert.pagingexample.api

import com.albert.pagingexample.response.MovieDetailsResponse
import com.albert.pagingexample.response.MoviesListResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Response
import retrofit2.http.Path

interface ApiServices {

    //    https://api.themoviedb.org/3/movie/550?api_key=***
    //    https://api.themoviedb.org/3/movie/popular?api_key=***
    //    https://api.themoviedb.org/3/

    @GET("movie/popular")
    suspend fun getPopularMoviesList(@Query("page") page: Int): Response<MoviesListResponse>

    @GET("movie/{movie_id}")
    suspend
    fun getMovieDetails(@Path("movie_id") id: Int): Response<MovieDetailsResponse>



}