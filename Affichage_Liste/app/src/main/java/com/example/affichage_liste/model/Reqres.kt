package com.example.affichage_liste.model


import com.google.gson.annotations.SerializedName

data class Reqres(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("status")
    val status: Int,
    @SerializedName("type")
    val type: String
)