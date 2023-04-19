package com.albert.pagingexample.repository

import com.albert.pagingexample.api.ApiServices
import javax.inject.Inject




class  ApiRepository @Inject constructor(
    private  val  apiServices: ApiServices
){
    suspend fun getPopularMoviesList(page: Int) = apiServices.getPopularMoviesList(page)
    suspend fun getMovieDetails(id: Int) = apiServices.getMovieDetails(id)
}