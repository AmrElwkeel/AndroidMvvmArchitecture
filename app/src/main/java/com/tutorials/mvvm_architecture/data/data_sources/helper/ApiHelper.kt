package com.tutorials.mvvm_architecture.data.data_sources.helper

import com.tutorials.mvvm_architecture.data.models.Post
import retrofit2.http.GET
import retrofit2.http.Path

interface   ApiHelper {


    @GET("posts")
    suspend fun  getPosts():List<Post>

    @GET("posts/{id}")
    suspend fun  getPost(@Path("id") postId:Int):Post




    @GET("users/{id}")
    suspend fun  getUser(@Path("id") postId:Int):Post
}
