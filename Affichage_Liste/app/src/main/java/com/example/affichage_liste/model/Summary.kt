package com.example.affichage_liste.model


import com.google.gson.annotations.SerializedName

data class Summary(
    @SerializedName("active_cases")
    val activeCases: Int,
    @SerializedName("critical")
    val critical: Int,
    @SerializedName("death_ratio")
    val deathRatio: Double,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("recovered")
    val recovered: Int,
    @SerializedName("recovery_ratio")
    val recoveryRatio: Double,
    @SerializedName("tested")
    val tested: Int,
    @SerializedName("total_cases")
    val totalCases: Int
)