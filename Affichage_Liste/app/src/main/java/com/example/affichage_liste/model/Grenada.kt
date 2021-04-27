package com.example.affichage_liste.model


import com.google.gson.annotations.SerializedName

data class Grenada(
    @SerializedName("active_cases")
    val activeCases: Int,
    @SerializedName("change")
    val change: ChangeXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX,
    @SerializedName("critical")
    val critical: Int,
    @SerializedName("death_ratio")
    val deathRatio: Double,
    @SerializedName("deaths")
    val deaths: Int,
    @SerializedName("iso3166a2")
    val iso3166a2: String,
    @SerializedName("iso3166a3")
    val iso3166a3: String,
    @SerializedName("iso3166numeric")
    val iso3166numeric: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("recovered")
    val recovered: Int,
    @SerializedName("recovery_ratio")
    val recoveryRatio: Double,
    @SerializedName("tested")
    val tested: Int,
    @SerializedName("total_cases")
    val totalCases: Int
)