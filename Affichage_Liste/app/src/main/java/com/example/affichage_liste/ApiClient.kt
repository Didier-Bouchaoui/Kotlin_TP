package com.example.affichage_liste

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.example.affichage_liste.UserService
import com.example.affichage_liste.ApiClient

object ApiClient {
    private val retrofit: Retrofit
        private get() = Retrofit.Builder()
            .baseUrl("https://public.api.quarantine.country/summary/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    val userService: UserService
        get() = retrofit.create(UserService::class.java)
}