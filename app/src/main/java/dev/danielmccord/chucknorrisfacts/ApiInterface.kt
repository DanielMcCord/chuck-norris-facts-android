package dev.danielmccord.chucknorrisfacts

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("random")
    fun getRandom(
        @Query("category") category: String?,
        @Query("name") name: String?
    ): Call<ChuckFact>

    @GET("categories")
    fun getCategories(): Call<List<ChuckCategory>>

    @GET("search")
    fun getSearch(
        @Query("query") query: String?
    ): Call<List<ChuckFact>>
}