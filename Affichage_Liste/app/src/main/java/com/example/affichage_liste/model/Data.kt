package com.example.affichage_liste.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("change")
    val change: Change,
    @SerializedName("generated_on")
    val generatedOn: Int,
    @SerializedName("regions")
    val regions: Regions,
    @SerializedName("summary")
    val summary: Summary
)