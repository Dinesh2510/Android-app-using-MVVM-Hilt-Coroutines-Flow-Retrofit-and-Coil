package com.example.androidflow.Models

import com.google.gson.annotations.SerializedName

data class Resolutions (

    @SerializedName("original") var original : Original,
    @SerializedName("medium") var medium : Medium

)