package com.example.affichage_liste

import retrofit2.Call
import retrofit2.http.GET

interface UserService {
    @get:GET("latest")
    val allUsers: Call<List<UserResponse?>?>?
}