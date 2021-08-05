package com.example.githubuserapps2.api

import com.example.githubuserapps2.Respons.ModelUser
import com.example.githubuserapps2.Respons.UserRespon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("users/{username}")
    @Headers("Authorization: token 75e8243fb3f685162d6e51a1137011ecc0872716")
    fun getDetailUser(
        @Path("username") username: String?
    ): Call<ModelUser>

    @GET("search/users")
    @Headers("Authorization: token 75e8243fb3f685162d6e51a1137011ecc0872716")
    fun getSearchUser(
        @Query("q") q: String?
    ): Call<UserRespon>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 75e8243fb3f685162d6e51a1137011ecc0872716")
    fun getFollowersUser(
        @Path("username") username: String?
    ): Call<ArrayList<ModelUser>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 75e8243fb3f685162d6e51a1137011ecc0872716")
    fun getFollowingUser(
        @Path("username") username: String?
    ): Call<ArrayList<ModelUser>>
}