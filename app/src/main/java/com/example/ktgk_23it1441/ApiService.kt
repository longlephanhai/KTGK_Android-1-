package com.example.ktgk_23it1441

import retrofit2.http.GET

interface ApiService {
    @GET("comments")
    suspend fun getPosts(): List<Post>

}